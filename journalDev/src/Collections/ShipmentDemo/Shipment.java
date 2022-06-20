package Collections.ShipmentDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{
	
	private static final int LIGHT_VAN_MAX_WEIGHT=20; 
	private static final int MISSING_ITEM_INDEX=-1;
	
	
	private final List<Product> products = new ArrayList<Product>();
	
	public void add(Product product) {
		
		products.add(product);
		
	}
	
	public boolean replace(Product oldProduct, Product newProduct) {
		System.out.println(products);
		int position= products.indexOf(oldProduct);
//		System.out.println(position);
//		System.out.println(products.get(position));
		if(position == MISSING_ITEM_INDEX) {
			return false;
		}
		else {
			products.add(position, newProduct);
			System.out.println(products);
			return true;
		}
		
		
	}

	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return products.iterator();
	}

	@Override
	public String toString() {
		return "Shipment [products=" + products + "]";
	}

	public boolean contains(Product door, Product window) {
		// TODO Auto-generated method stub
		
		if(products.contains(door) && products.contains(window)) {
			return true;
		}
		else return false;
	}

}
