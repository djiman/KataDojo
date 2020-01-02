package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import java.util.List;
 
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSumSpec {
	@Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(SumSpec.calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }
}
