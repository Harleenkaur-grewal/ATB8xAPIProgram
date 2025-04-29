package PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest012_NonBDDStyle {
    @Description("Verify PATCH Response-Non BDD")
    @Test
    public void test_PATCH_Request_BDD() {
        String token = "12f251f93f29bd3";
        String bookingID = "511";
        String payload = "{\n" +
                "    \"firstname\" : \"Raj\",\n" +
                "    \"lastname\" : \"Arora\"\n" +
                "}";
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com");
        request.basePath("/booking/" + bookingID);
        request.contentType(ContentType.JSON);
        request.cookie("token", token);
        request.body(payload);
        request.log().all();

        Response response = request.when().patch();

        ValidatableResponse validate = response.then().log().all();
        validate.statusCode(200);
    }
    }
