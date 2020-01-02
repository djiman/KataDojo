package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import djiman.samples.kata.dojo.beans.Person;

import java.util.List;
 
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TestJoiningSpec {
    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(JoiningSpec.namesToString(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }
}
