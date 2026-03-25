import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.equalTo;

public class GetPostsByUserIdTest {

    @Test
    void getPostsByUserIdShouldReturnOnlyPostsForUser1() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .queryParam("userId", 1)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("userId", everyItem(equalTo(1)));
    }
}
