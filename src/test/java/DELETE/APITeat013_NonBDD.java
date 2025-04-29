package DELETE;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITeat013_NonBDD {
    @Description("Verify DELETE Response-Non BDD")
    @Test
    public void test_DELETE_Request_BDD() {
        String token = "4db042ec4cea53c";
        String bookingID = "1104";
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com");
        request.basePath("/booking/" + bookingID);
        request.contentType(ContentType.JSON);
        request.cookie("token", token);
        request.log().all();

        Response response = request.when().delete();

        ValidatableResponse validate = response.then().log().all();
        validate.statusCode(201);
    }
}
