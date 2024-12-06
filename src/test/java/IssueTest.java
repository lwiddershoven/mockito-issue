import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;

public class IssueTest {

    @Test
    void issue() {
        var good = mock(IssueTest.class);
        var error = mock(Method.class);
    }
}
