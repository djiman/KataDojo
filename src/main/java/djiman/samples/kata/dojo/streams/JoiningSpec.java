package djiman.samples.kata.dojo.streams;

import java.util.List;
import java.util.stream.Collectors;

import djiman.samples.kata.dojo.beans.Person;

public class JoiningSpec {

	public static String namesToString(List<Person> collection) {	
		return collection.stream().map(Person::getNom).collect(Collectors.joining(", ", "Names: ", "."));
	}

}
