package GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest006_NonBDDStyle_TestNG {
   //static RequestSpecification r = RestAssured.given();
   @Severity(SeverityLevel.CRITICAL)
   @Description("TC1-NonBDDStyle_Positive Test Case")
   @Test
    public void test_NonBDDStyle_GET_Pos(){
       // String pin_code ="141201";
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/141201");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("TC1-NonBDDStyle_Negative Test Case")
    @Test
    public void test_NonBDDStyle_GET_Neg(){
        // String pin_code ="141201";
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}
