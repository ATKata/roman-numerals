package kata.numerals;

import java.util.Arrays;
import java.util.List;

public class RomanNumeralGenerator {

	private static List<Numeral> numerals;

	public RomanNumeralGenerator() {
		numerals = Arrays.asList(
				new Numeral("M", 1000),
				new Numeral("CM", 900),
				new Numeral("D", 500),
				new Numeral("CD", 400),
				new Numeral("C", 100),
				new Numeral("XC", 90),
				new Numeral("L", 50),
				new Numeral("XL", 40),
				new Numeral("X", 10),
				new Numeral("IX", 9),
				new Numeral("V", 5),
				new Numeral("IV", 4),
				new Numeral("I", 1));

	}

	public String convert(int decimalNumber) {
		StringBuilder string = new StringBuilder();
		while (decimalNumber > 0) {
			for (Numeral n : numerals) {
				if (decimalNumber >= n.value) {
					string.append(n.symbol);
					decimalNumber -= n.value;
					break;
				}
			}
		}
		return string.toString();
	}
}
