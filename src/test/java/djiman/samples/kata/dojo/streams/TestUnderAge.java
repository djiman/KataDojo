package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import djiman.samples.kata.dojo.beans.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TestUnderAge {
	@Test
	public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		Person anna = new Person("Anna", 5);
		List<Person> collection = asList(sara, eva, viktor, anna);
		assertThat(UnderAge.getKidNames(collection)).contains("Sara", "Anna").doesNotContain("Viktor", "Eva");
	}
}
