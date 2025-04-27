package POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest008_NonBDDStyle_TestNG {
    @Description("Verify POST Request-Non BDD Style")
    @Test
    public void test_POST_Req_NonBDD() {
        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.log().all().body(payload);
        r.when().log().all().post();
        r.then().log().all().statusCode(200);
    }
}