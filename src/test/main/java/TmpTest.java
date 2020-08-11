import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TmpTest {

    @Test
    void testGetValue() throws Exception {
        assertThat(Tmp.getValue()).isEqualTo("Hello");
    }
}
