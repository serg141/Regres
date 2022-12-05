import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserSingleTest {
    UserSingle userSingle = new UserSingle();

    @BeforeClass
    public void getSpec() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec200());
        userSingle.getUserSingle();
    }

    @Test
    public void getSupport() {
        assertEquals("https://reqres.in/#support-heading", userSingle.getUrl());
        assertEquals("To keep ReqRes free, contributions towards server costs are appreciated!", userSingle.getText());
    }

    @Test
    public void getUser() {
        assertEquals(2, userSingle.getId());
        assertEquals("janet.weaver@reqres.in", userSingle.getEmail());
        assertEquals("Janet", userSingle.getFirst_name());
        assertEquals("Weaver", userSingle.getLast_name());
        assertEquals("https://reqres.in/img/faces/2-image.jpg", userSingle.getAvatar());
    }
}
