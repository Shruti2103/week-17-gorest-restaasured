package in.co.gorest.studentinfo;


import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestGetTest extends TestBase {

    @Test
    public void getAllusersInfo() {
        Response response=given()
                .when()
                .get("users");
        response.then().statusCode(200);
        response.prettyPrint();

        List<?> totalrecords = response.then().extract().path("");
        System.out.println("Total records are 20 :"+totalrecords.size());

        List<String>name=response.then().extract().path("findAll{it.id==3264}.name");
        System.out.println("Name value is :"+name);

        List<String>email=response.then().extract().path("findAll{it.id==3263}.email");
        System.out.println("Email id is :"+email);

        List<String>status=response.then().extract().path("findAll{it.status=='active'}.id");
        System.out.println("Id of active Status are :"+status);

        List<String>femalegender=response.then().extract().path("findAll{it.id==3263}.gender");
        System.out.println("Gender for ID is :"+femalegender);

        List<String>malegender=response.then().extract().path("findAll{it.id==3261}.gender");
        System.out.println("Gender for ID is :"+malegender);














    }









}
