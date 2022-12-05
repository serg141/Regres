import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ListUsersTest {
    ListUsers listUsers = new ListUsers();

    @BeforeClass
    public void getSpec() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec200());
        listUsers.getListUsers();
    }

    @Test
    public void getPage() {
        assertEquals(2, listUsers.getPage());
        assertEquals(6, listUsers.getPer_page());
        assertEquals(12, listUsers.getTotal());
        assertEquals(2, listUsers.getTotal_pages());
    }

    @Test
    public void getSupport() {
        assertEquals("https://reqres.in/#support-heading", listUsers.getUrl());
        assertEquals("To keep ReqRes free, contributions towards server costs are appreciated!", listUsers.getText());
    }

    @Test
    public void getUser() {
        assertEquals(7, listUsers.getId());
        assertEquals("michael.lawson@reqres.in", listUsers.getEmail());
        assertEquals("Michael", listUsers.getFirst_name());
        assertEquals("Lawson", listUsers.getLast_name());
        assertEquals("https://reqres.in/img/faces/7-image.jpg", listUsers.getAvatar());
    }
}
