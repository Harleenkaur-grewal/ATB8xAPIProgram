package POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class API009_BDDStyle {
    @Description("Verify POST request(create booking)-BDD Style")
@Test
    public void test_POST_Request(){
        String payload = "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
    RestAssured
            .given()
            .baseUri("https://restful-booker.herokuapp.com")
            .basePath("/booking")
            .contentType(ContentType.JSON)
            .log().all().body(payload)
            .when()
            .log()
            .all()
            .post()
            .then()
            .log()
            .all()
            .statusCode(200);
}
}
