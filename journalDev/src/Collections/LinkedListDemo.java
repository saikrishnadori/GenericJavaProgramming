package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkList = new LinkedList<>();
		List<Integer> arrayList1 = new ArrayList<>();
		
		
		arrayList1.add(12);
		arrayList1.add(13);
		arrayList1.add(14);
		
		
		linkList.add(1);
		linkList.addFirst(0);
		linkList.addLast(9);
		linkList.add(21);
		linkList.add(2, 2);
		System.out.println(linkList);
		linkList.addAll(arrayList1);
		System.out.println(linkList);
		
		linkList.getLast();
		System.out.println(linkList.getLast());
		
		System.out.println("printing data using forEach");
		
		for(int i:linkList) {
			System.out.println(i);
		}
	}

}
