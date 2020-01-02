package djiman.samples.kata.dojo.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import djiman.samples.kata.dojo.beans.Person;

public class GroupingSpec {

	public static Map<String, List<Person>> groupByNationality(List<Person> collection) {
		return collection.stream().collect(Collectors.groupingBy(p -> p.getNationality()));
	}

}
