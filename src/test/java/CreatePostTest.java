import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class CreatePostTest {

    @Test
    void createPostShouldReturn201AndId() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .contentType("application/json")
                .body("""
                {
                  "title": "My first POST test",
                  "body": "This is a test created via Postman",
                  "userId": 1
                }
            """)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("id", notNullValue());
    }
}