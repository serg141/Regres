import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ListResourceTest {
    ListResource listResource = new ListResource();

    @BeforeClass
    public void getSpec() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec200());
        listResource.getResource();
    }

    @Test
    public void userSingleError() {
        assertEquals("blue turquoise", listResource.getName());
        assertEquals(2005, listResource.getYear());
        assertEquals("#53B0AE", listResource.getColor());
        assertEquals("15-5217", listResource.getPantone_value());
    }
}
