package com.webops.fedex.services;

import com.google.gson.Gson;
import com.squareup.okhttp.*;
import com.webops.fedex.models.AuthToken;
import com.webops.fedex.models.FedExClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class FedExAuthToken {

    private FedExClient fedExClient;

    public FedExAuthToken(FedExClient fedExClient) {
        this.fedExClient = fedExClient;
    }

    public AuthToken getAuthToken() throws IOException {

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials&client_id=l7c8314925916d4d2da27f15fecf493db9&client_secret=21f0a458bdd2406d93fc4979a41e4dd5");
        Request request = new Request.Builder()
                .url(fedExClient.getUrl())
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();

        if(response.isSuccessful()) {

            ResponseBody responseBody = response.body();
            String str = responseBody.string();
            AuthToken authToken = new Gson().fromJson(str, AuthToken.class);

            return authToken;
        }


        return null;
    }

}
