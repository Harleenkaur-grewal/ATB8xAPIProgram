package org.example.sampleCheck;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest004_TestNG {
    @Test
    public void test_NameOfTest(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

}
