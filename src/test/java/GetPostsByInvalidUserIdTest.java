import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class GetPostsByInvalidUserIdTest {

    @Test
    void getPostsByInvalidUserIdShouldReturnEmptyList() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .queryParam("userId", 9999)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("", hasSize(0));
    }
}