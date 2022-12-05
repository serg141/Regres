import lombok.Data;

import java.util.List;

import static io.restassured.RestAssured.given;

@Data
public class ListResource {
    private String name, color, pantone_value;
    private int id, year;

    public void getResource() {
        List<ListResource> listResource = given().when().get("/api/unknown").then().extract().body()
                .jsonPath().getList("data", ListResource.class);

        for (ListResource resource : listResource) {
            if (resource.getId() == 6) {
                year = resource.getYear();
                name = resource.getName();
                color = resource.getColor();
                pantone_value = resource.getPantone_value();
            }
        }
    }
}
