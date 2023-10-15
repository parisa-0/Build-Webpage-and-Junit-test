package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
 import org.example.Main;

public class ExpenseSheetManagementEndToEndTest {

   @Test void homePageTest() throws URISyntaxException, IOException, InterruptedException {
       HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("http://localhost:8080"))
               .GET()
               .build();

       HttpClient httpClient = HttpClient.newHttpClient();
       HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

       assertThat(response.statusCode(), equalTo(200));
   }

}
