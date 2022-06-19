package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Hello");
		hashSet.add("World");
		hashSet.remove("Hello");
		hashSet.add("Worldoo");
		System.out.println(hashSet);

	}

}
