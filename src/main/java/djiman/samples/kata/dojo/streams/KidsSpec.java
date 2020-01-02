package djiman.samples.kata.dojo.streams;

import java.util.List;
import java.util.stream.Collectors;

import djiman.samples.kata.dojo.beans.Person;

public class KidsSpec {

	public static List<String> getKidNames(List<Person> collection) {		
		return collection.stream().filter(p -> p.getNationality() != null && p.getNationality().equals("Norway")).map(p -> p.getNom()).collect(Collectors.toList());
	}

}
