package POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITest007_BDDStyle_TestNG {
    @Description("Verify the POST Request-BDD Style")
    @Test
    public void test_POST_Req_BDD() {
        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
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
