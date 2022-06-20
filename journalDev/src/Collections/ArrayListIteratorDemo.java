package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Collections.Product;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product door = new Product("Wooden",35);
		Product floorPanel = new Product("Floor Panel",28);
		Product window = new Product("Glass Window",16);
		
		Collection<Product> products = new ArrayList<>(); 
		
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		System.out.println("checking size of coll "+products.size());
		System.out.println("checking isEmpty "+products.isEmpty());
		System.out.println("checking contains with unknow coll"+products.contains(products));
		System.out.println("checking contains with known coll	"+products.contains(window));
		System.out.println("printing the collection"+products);
		System.out.println("removing the floorPanel"+products.remove(floorPanel));
		System.out.println("print after remove coll"+products);
		
//		for(Product product:products) {
//			if(product.getWeight()>20) {
//				products.remove(product); // will get java.util.ConcurrentModificationException 
//				// as ArrayList is not Thread safe. So alternate is Iterator.
//			}
//		}
		
		//Iterators
		
		Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext()){
			Product product = iterator.next();
			if(product.getWeight()>20) {
				iterator.remove(); // it removes and work's as expected 
			}
//			System.out.println(iterator.next());
		}
		System.out.println(products);

	}

}
