package djiman.samples.kata.dojo.streams;

import org.junit.Test;

import djiman.samples.kata.dojo.beans.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TestKidsSpec {
	
	@Test
	public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
		Person sara = new Person("Sara", 4, "Norway");
		Person viktor = new Person("Viktor", 40, "Russia");
		Person eva = new Person("Eva", 42, "Usa");
		Person anna = new Person("Anna", 5, "Norway");
		List<Person> collection = asList(sara, eva, viktor, anna);
		assertThat(KidsSpec.getKidNames(collection)).contains("Sara", "Anna").doesNotContain("Viktor", "Eva");
	}
}
