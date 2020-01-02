package djiman.samples.kata.dojo.streams;
import org.junit.Test;

import java.util.List;

import djiman.samples.kata.dojo.beans.Person;
import djiman.samples.kata.dojo.streams.OldestPersonSpec;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
 

public class TestOldestPersonSpec {
	
    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(OldestPersonSpec.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

}
