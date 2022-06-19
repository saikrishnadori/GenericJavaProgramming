package Java8.Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList = new ArrayList<>(5);
		
		List<String> languages = new ArrayList<>(5);
		languages.add("Java");
		languages.add("Python");
		languages.add("PLSQL");
		languages.add("C#");
		languages.add("JavaScript");
		
		//filter 
		
		List<String> startWithList = languages.stream().filter(x-> x.startsWith( "P")).collect(Collectors.toList());
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println(startWithList);
		
		
		List<Integer> squareList = arrayList.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println(squareList); //[1, 4, 9, 16, 25]
		
		List<Integer> cubeList = arrayList.stream().map(x-> x*x).map(x->x%5).collect(Collectors.toList());
		System.out.println(cubeList); //[1, 4, 4, 1, 0]
		
		
		
	}

}
