package djiman.samples.kata.dojo.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import djiman.samples.kata.dojo.beans.Person;

public class PartitioningSpec {

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> collection) {	
		return collection.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
	}

}
