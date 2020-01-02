package djiman.samples.kata.dojo.streams;

import java.util.Comparator;
import java.util.List;

import djiman.samples.kata.dojo.beans.Person;

public class OldestPersonSpec {

	public static Person getOldestPerson(List<Person> collection) {
		return collection.stream().max(Comparator.comparing(Person::getAge)).get();
	}

}
