package PUT;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest011_NonBDDStyle_TestNG {
  @Description("Verify PUT Response-Non BDD")
   @Test
    public void test_Put_Request_BDD(){
       String token = "12f251f93f29bd3";
       String bookingID ="511";
       String payload = "{\n" +
               "    \"firstname\" : \"Harry\",\n" +
               "    \"lastname\" : \"Grewal\",\n" +
               "    \"totalprice\" : 111,\n" +
               "    \"depositpaid\" : true,\n" +
               "    \"bookingdates\" : {\n" +
               "        \"checkin\" : \"2018-01-01\",\n" +
               "        \"checkout\" : \"2019-01-01\"\n" +
               "    },\n" +
               "    \"additionalneeds\" : \"Breakfast\"\n" +
               "}";
      RequestSpecification request = RestAssured.given();
      request.baseUri("https://restful-booker.herokuapp.com");
      request.basePath("/booking/"+bookingID);
      request.contentType(ContentType.JSON);
      request.cookie("token", token);
      request.body(payload);
      request.log().all();

      Response response = request.when().put();

      ValidatableResponse validate = response.then().log().all();
      validate.statusCode(200);

   }
}
