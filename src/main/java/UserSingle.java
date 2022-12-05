import io.restassured.response.Response;
import lombok.Data;

import static io.restassured.RestAssured.given;

@Data
public class UserSingle {
    private String email, first_name, last_name, avatar;
    private String url, text;
    private int id;

    public void getUserSingle() {
        Response response = given().when().get("/api/users/2").then().extract().response();

        email = response.path("data.email");
        first_name = response.path("data.first_name");
        last_name = response.path("data.last_name");
        avatar = response.path("data.avatar");
        id = response.path("data.id");

        url = response.path("support.url");
        text = response.path("support.text");
    }
}
