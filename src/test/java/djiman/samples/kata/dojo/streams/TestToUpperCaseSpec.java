package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import java.util.List;
import djiman.samples.kata.dojo.streams.ToUpperCaseSpec;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Convert elements of a collection to upper case.
 */
public class TestToUpperCaseSpec {

	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
		assertThat(ToUpperCaseSpec.transform7(collection)).hasSameElementsAs(expected);
		assertThat(ToUpperCaseSpec.transform(collection)).hasSameElementsAs(expected);
	}
}
