import static io.restassured.RestAssured.given;

public class Error {
    public void getUserSingleError() {
        given().when().get("/api/users/23");
    }
}
