package in.co.gorest.studentinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GoRestDeleteTest extends TestBase {
    @Test
    public void delateuser(){
        Response response=given()
                .pathParam("id", 5893)
                .when()
                .delete("users/{id}");
        response.then().statusCode(204);
        System.out.println("Data is delated");
        response.prettyPrint();
    }

}
