package in.co.gorest.studentinfo;


import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestPostTest extends TestBase {

    @Test
    public void createUser() {


        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna66@gmail.com");
        goRestPojo.setStatus("active");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(goRestPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();


    }
}
