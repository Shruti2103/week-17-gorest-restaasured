package in.co.gorest.studentinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestPutTest extends TestBase {
    @Test
    public void updateuser() {


        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Allasani Peddana");
        goRestPojo.setEmail("allasani.peddana69@gmail.com");
        goRestPojo.setStatus("active");



        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(goRestPojo)
                .when()
                .put("users/5893");
        response.then().statusCode(201);
        response.prettyPrint();


    }

}
