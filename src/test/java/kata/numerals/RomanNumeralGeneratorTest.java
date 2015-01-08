package kata.numerals;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralGeneratorTest {

    @Test
    public void greetingShouldBeHelloWorld() {
        RomanNumeralGenerator greeter = new RomanNumeralGenerator();
        String greeting = greeter.getGreeting();
        assertThat(greeting, equalTo("Hello world!"));
    }
}
