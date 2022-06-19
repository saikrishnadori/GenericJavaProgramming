package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void ensureCapacity(int minCapacity) {
		System.out.println("in ensureCapacity method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrList = new ArrayList<>();  //default capacity of an ArrayList is 10
		System.out.println(arrList.size());
		System.out.println(arrList);
		
		
		
		
		for(int i=0;i<15;i++) {
			arrList.add(i);
			
		}
		System.out.println(arrList.size() );
		System.out.println(arrList);
		

	}

}
