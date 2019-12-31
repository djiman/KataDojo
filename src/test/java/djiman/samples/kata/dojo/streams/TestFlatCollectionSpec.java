package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import java.util.List;
 
import djiman.samples.kata.dojo.streams.FlatCollectionSpec;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TestFlatCollectionSpec {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(FlatCollectionSpec.transform(collection)).hasSameElementsAs(expected);
    }

}
