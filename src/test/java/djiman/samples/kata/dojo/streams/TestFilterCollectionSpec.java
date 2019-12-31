package djiman.samples.kata.dojo.streams;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import djiman.samples.kata.dojo.streams.FilterCollectionSpec;

import org.junit.Test;

public class TestFilterCollectionSpec {

	@Test
	public void transformShouldFilterCollection() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("My", "is", "Doe");
		assertThat(FilterCollectionSpec.transform(collection)).hasSameElementsAs(expected);
	}

}
