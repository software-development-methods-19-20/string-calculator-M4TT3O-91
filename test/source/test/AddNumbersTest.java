package test;

import dssc.StringCalcualtor;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNumbersTest {
    @Test
    void emptyString() {
        //assertEquals(0, StringCalcualtor.add(""));
        assertThat(StringCalcualtor.add(""), is(0));
    }

    @Test
    void oneNumber() { assertThat(StringCalcualtor.add("1"), is(1)); }

    @Test
    void twoNumbers() {
        assertThat(StringCalcualtor.add("1,2"),is(3));
    }

    @Test
    void numbers(){assertThat(StringCalcualtor.add("1,2,3"), is(6)); }
    @Test
    void NewLine (){assertThat(StringCalcualtor.add("1\n2\n3"),is(6));}

}
