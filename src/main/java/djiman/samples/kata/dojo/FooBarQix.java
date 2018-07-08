package djiman.samples.kata.dojo;

import org.springframework.stereotype.Service;

/**
 * @author gorguindong
 *
 */
@Service
public class FooBarQix {

	public String compute(String pNumber) {
		String result = "";
		result = verifyDivisibility(pNumber, result);
		for (Character charac : pNumber.toCharArray()) {
			result = result + computeEachNumber(charac);
		}
		if (result.isEmpty()) {
			return pNumber;
		}
		return result;
	}

	private String computeEachNumber(Character pNumber) {
		String result = "";
		if (pNumber == '0')
			return "*";
		if (pNumber == '3') {
			result = result + "Foo";
		}
		if (pNumber == '5') {
			result = result + "Bar";
		}
		if (pNumber == '7') {
			result = result + "Qix";
		}
		return result;
	}

	private String verifyDivisibility(String pNumber, String result) {
		int nombre = Integer.parseInt(pNumber);
		if (nombre == 0) {
			return result;
		}
		if (nombre % 3 == 0) {
			result = result + "Foo";
		}
		if (nombre % 5 == 0) {
			result = result + "Bar";
		}
		if (nombre % 7 == 0) {
			result = result + "Qix";
		}
		return result;
	}
}