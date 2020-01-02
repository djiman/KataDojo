package djiman.samples.kata.dojo.streams;

import java.util.List;

public class SumSpec {

	public static int calculate(List<Integer> numbers) {
		return numbers.stream().mapToInt(i -> i.intValue()).sum();
	}
}
