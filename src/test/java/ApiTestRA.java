
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTestRA {

    public static void main(String[] args) {

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));

        System.out.println("TEST PASSED");
    }
}

