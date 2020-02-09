package djiman.samples.kata.dojo.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import djiman.samples.kata.dojo.beans.Person;

public class UnderAge {
	public static Set<String> getKidNames(List<Person> people) {
		return people.stream().filter(p -> p.getAge() < 18).map( n -> n.getNom()).collect(Collectors.toSet());
	}
}
