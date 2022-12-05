import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ErrorTest {
    Error error = new Error();

    @BeforeClass
    public void getSpec() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec404());
    }

    @Test
    public void userSingleError() {
        error.getUserSingleError();
    }
}
