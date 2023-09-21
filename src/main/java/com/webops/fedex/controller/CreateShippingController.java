package com.webops.fedex.controller;

import com.google.gson.Gson;
import com.squareup.okhttp.*;

import com.webops.fedex.models.*;
import com.webops.fedex.models.Address;
import com.webops.fedex.services.FedExAuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
//@Api
@RequestMapping("/fedex")
@CrossOrigin
@Slf4j
public class CreateShippingController {

    @Autowired
    private FedExAuthToken fedExAuthToken;

    @Value("${fedex.api.shipment.url}")
    private String shipmentUrl;

    @PostMapping("/createShipping")
    public ResponseEntity<Response> createShipping() {
        try {
            OkHttpClient client = new OkHttpClient();

            log.info("Working");

            AuthToken authToken = fedExAuthToken.getAuthToken();

        MediaType mediaType = MediaType.parse("application/json");

        String body = getBody();
        String token = authToken.getAccess_token();
        RequestBody requestBody = RequestBody.create(mediaType, body);
        Request request = new Request.Builder()
                .url(shipmentUrl)
                .post(requestBody)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("X-locale", "en_US")
                .addHeader("Authorization", "Bearer " + token)
                .build();


            Response response = client.newCall(request).execute();

            return ResponseEntity.ok(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getBody() {
        FedExShipmentRequest fedExShipmentRequest = new FedExShipmentRequest();

        AccountNumber accountNumber = new AccountNumber();
        accountNumber.setValue("510087020");
        fedExShipmentRequest.setAccountNumber(accountNumber);
        fedExShipmentRequest.setLabelResponseOptions("LABEL");

        Address shipperAddress = new Address();
        shipperAddress.setCity("Eagan");
        shipperAddress.setCountryCode("USA");
        shipperAddress.setResidential(true);
        shipperAddress.setPostalCode("55123");
        shipperAddress.setStateOrProvinceCode("MN");
        String street = "123 Main Street";
        List<String> streets = new ArrayList<>();
        streets.add(street);
        shipperAddress.setStreetLines(streets);

        Contact shipperContact = new Contact();
        shipperContact.setCompanyName("WebOps");
        shipperContact.setPersonName("Mr 1 Pct");
        shipperContact.setPhoneNumber("80C-CALL-WEBOPS");

        Shipper shipper = new Shipper();
        shipper.setAddress(shipperAddress);
        shipper.setContact(shipperContact);

        Address recipientsAddress = new Address();
        recipientsAddress.setCity("Harrison");
        recipientsAddress.setCountryCode("USA");
        recipientsAddress.setResidential(true);
        recipientsAddress.setPostalCode("72601");
        recipientsAddress.setStateOrProvinceCode("AR");

        String recipientsStreet = "2000 Freight LTL Testing";
        List<String> recipientStreets = new ArrayList<>();
        recipientStreets.add(recipientsStreet);
        recipientsAddress.setStreetLines(recipientStreets);

        Contact recipientContact = new Contact();
        recipientContact.setCompanyName("WebOps");
        recipientContact.setPersonName("Mr 1 Pct");
        recipientContact.setPhoneNumber("80C-CALL-WEBOPS");

        List<Recipient> recipients = new ArrayList<>();
        Recipient recipient = new Recipient();
        recipient.setAddress(recipientsAddress);
        recipient.setContact(recipientContact);
        recipients.add(recipient);

        RequestedShipment requestedShipment = new RequestedShipment();
        requestedShipment.setShipper(shipper);
        requestedShipment.setRecipients(recipients);
        requestedShipment.setPickupType("DROPOFF_AT_FEDEX_LOCATION");
        requestedShipment.setServiceType("STANDARD_OVERNIGHT");
        requestedShipment.setPackagingType("YOUR_PACKAGING ");

        ShippingChargesPayment shippingChargesPayment = new ShippingChargesPayment();
        shippingChargesPayment.setPaymentType("SENDER");
        requestedShipment.setShippingChargesPayment(shippingChargesPayment);

        LabelSpecification labelSpecification = new LabelSpecification();
        labelSpecification.setLabelStockType("PAPER_4X6");
        labelSpecification.setImageType("PDF");
        requestedShipment.setLabelSpecification(labelSpecification);

        RequestedPackageLineItem requestedPackageLineItem = new RequestedPackageLineItem();
        Weight weight = new Weight();
        weight.setValue(2);
        weight.setUnits("KG");
        requestedPackageLineItem.setWeight(weight);
        List<RequestedPackageLineItem> requestedPackageLineItems = new ArrayList<>();
        requestedPackageLineItems.add(requestedPackageLineItem);
        requestedShipment.setRequestedPackageLineItems(requestedPackageLineItems);

        requestedShipment.setTotalPackageCount(1);
        requestedShipment.setTotalWeight(2.0);
        fedExShipmentRequest.setRequestedShipment(requestedShipment);

        return new Gson().toJson(fedExShipmentRequest);
    }

}
