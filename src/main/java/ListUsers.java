import io.restassured.response.Response;
import lombok.Data;

import static io.restassured.RestAssured.given;

@Data
public class ListUsers {
    private int page, per_page, total, total_pages, id;
    private String url, text;
    private String email, first_name, last_name, avatar;

    public void getListUsers() {
        Response response = given().when().get("/api/users?page=2").then().extract().response();

        page = response.path("page");
        per_page = response.path("per_page");
        total = response.path("total");
        total_pages = response.path("total_pages");

        url = response.path("support.url");
        text = response.path("support.text");

        id = response.path("data[0].id");
        email = response.path("data[0].email");
        first_name = response.path("data[0].first_name");
        last_name = response.path("data[0].last_name");
        avatar = response.path("data[0].avatar");
    }
}
