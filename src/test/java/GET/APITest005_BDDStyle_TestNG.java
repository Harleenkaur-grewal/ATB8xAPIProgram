package GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest005_BDDStyle_TestNG {
    @Test
    public void test_GET_Req_Pos(){
        String pin_code ="141201";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us/")
                    .basePath("/IN/"+pin_code)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log()
                    .all()
                    .statusCode(200);
    }
    @Test
    public void test_GET_Req_Neg(){
        String pin_code ="-1";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us/")
                    .basePath("/IN/"+pin_code)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log()
                    .all()
                    .statusCode(200);
    }


}
