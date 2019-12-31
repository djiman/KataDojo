package djiman.samples.kata.dojo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCaseSpec {
	public static List<String> transform7(List<String> collection) {
        List<String> coll = new ArrayList<>();
        for (String element : collection) {
            coll.add(element.toUpperCase());
        }
        return coll;
    }
	
	public static List<String> transform(List<String> collection) {
        return collection.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
