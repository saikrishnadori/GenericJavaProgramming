package Collections.Map;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> deQueue= new PriorityQueue<>();
		Object toArrayList = new ArrayList<>();
		deQueue.add("Jan");
		deQueue.add("Feb");
		deQueue.add("Apr");
		deQueue.add("May");
		deQueue.add("Mar");
		
		System.out.println(deQueue);
		String head=deQueue.remove();
		System.out.println("print head: "+head);
		
		System.out.println(deQueue);
		System.out.println(deQueue.peek());// just gives the head
		System.out.println("After peek method"+deQueue);
		System.out.println(deQueue.poll());  //deletes and gives the head
		System.out.println("After peek method"+deQueue);
		System.out.println(deQueue.getClass());
		
		toArrayList=deQueue.toArray();
		System.out.println(toArrayList.getClass());   
		
		System.out.println(deQueue.toArray().getClass());

	}

}
