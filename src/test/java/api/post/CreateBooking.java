package api.post;

import api.base.BaseAPI;
import io.restassured.response.Response;
import org.apache.groovy.json.internal.IO;
import utils.JSONUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CreateBooking {

    //Method to handle positive test case with valid data
    public String createNewBooking() throws IOException {

        String requestBodyPath = "src/test/resources/request_JSON/CreateBookingRequest.json";
        Response response = BaseAPI.setupRequest()
                                   .body(new File(requestBodyPath))
                                   .post("/booking");

                                    response.then().log().all();

        // Print the raw response for debugging
        System.out.println("Raw Response: " + response.asString());

        // Validate if the response is actually JSON and handle it accordingly
        if (!response.contentType().contains("application/json")) {
            throw new IllegalStateException("Expected JSON response but received: " + response.contentType());
        }

        if (response.getStatusCode() != 200) {
            throw new IllegalStateException("Expected status code 200 but received: " + response.getStatusCode());
        }

        String bookingId = response.jsonPath().getString("bookingid");
        JSONUtils.saveResponseToFile(response, "Booking_" + bookingId + ".json");


        return bookingId;
    }

    public void createInvalidBooking() throws IOException {

        String requestBodyPath = "src/test/resources/request_JSON/CreateBookingRequest.json";
        Response response = BaseAPI.setupRequest()
                .body(new File(requestBodyPath))
                .post("/booking");

        if (response.getStatusCode() == 200){
            throw new AssertionError("Negative test case should not return 200 status code!");
        }

        // Save response even if the request fail (for debugging)
        JSONUtils.saveResponseToFile(response, "Negative_Booking_Response.json");
    }
}
