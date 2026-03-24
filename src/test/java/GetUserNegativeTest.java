
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetUserNegativeTest {

    @Test
    void getNonExistingUserShouldReturn500() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/users/9999")
                .then()
                .statusCode(404);
    }
}

