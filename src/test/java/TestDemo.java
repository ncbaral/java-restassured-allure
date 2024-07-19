import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class TestDemo {

    @Test
    void testSomeRequest() {
        given()
                .filter(new AllureRestAssured())
                .get("http://api.zippopotam.us/GB/LU2")
                .then()
                .body("country", equalTo("Great Britain"));
    }
}
