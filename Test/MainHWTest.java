import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;
//import static org.hamcrest.CoreMatchers.instanceOf;
//import static org.junit.Assert.assertThat;
//import static org.hamcrest.core.IsEqual.equalTo;

public class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void start() {
        mainHW = new MainHW();
    }

    @Test
    void testEvenNumber() {
        assertThat(mainHW.isEven(2) == true);
    }
    @Test
    void testEvenZero() {
        assertThat(mainHW.isEven(0) == true);
    }
    @Test
    void testOddNumber() {
        assertThat(mainHW.isEven(3) == false);
    }

    @Test
    void testNumber24() {
        assertThat(mainHW.isInInterval25To100(24) == false);
    }
    @Test
    void testNumber25() {
        assertThat(mainHW.isInInterval25To100(25) == true);
    }
    @Test
    void testNumber100() {
        assertThat(mainHW.isInInterval25To100(100) == true);
    }
    @Test
    void testNumber101() {
        assertThat(mainHW.isInInterval25To100(101) == false);
    }

}
