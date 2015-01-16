package kata.numerals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralGeneratorTest {
	private RomanNumeralGenerator converter;

	@Before
	public void setup() {
		converter = new RomanNumeralGenerator();
	}

    @Test
	public void shouldConvert1ToI() {
		assertEquals("I", converter.convert(1));
    }

	@Test
	public void shouldConvert2toII() {
		assertEquals("II", converter.convert(2));
	}

	@Test
	public void shouldConvert4ToIV() {
		assertEquals("IV", converter.convert(4));
	}

	@Test
	public void shouldConvert5ToV() {
		assertEquals("V", converter.convert(5));
	}

	@Test
	public void shouldConvert9ToIX() {
		assertEquals("IX", converter.convert(9));
	}

	@Test
	public void shouldConvert10ToX() {
		assertEquals("X", converter.convert(10));
	}

	@Test
	public void shouldConvert20ToXX() {
		assertEquals("XX", converter.convert(20));
	}

	@Test
	public void shouldConvert40ToXL() {
		assertEquals("XL", converter.convert(40));
	}

	@Test
	public void shouldConvert50ToL() {
		assertEquals("L", converter.convert(50));
	}

	@Test
	public void shouldConvert90ToXC() {
		assertEquals("XC", converter.convert(90));
	}

	@Test
	public void shouldConvert100ToC() {
		assertEquals("C", converter.convert(100));
	}

	@Test
	public void shouldConvert400ToCD() {
		assertEquals("CD", converter.convert(400));
	}

	@Test
	public void shouldConvert500ToD() {
		assertEquals("D", converter.convert(500));
	}

	@Test
	public void shouldConvert900ToCM() {
		assertEquals("CM", converter.convert(900));
	}

	@Test
	public void shouldConvert1000ToM() {
		assertEquals("M", converter.convert(1000));
	}

	@Test
	public void shouldConvert890ToDCCCXC() {
		assertEquals("DCCCXC", converter.convert(890));
	}
}
