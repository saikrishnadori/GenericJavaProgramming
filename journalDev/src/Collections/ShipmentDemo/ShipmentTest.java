package Collections.ShipmentDemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class ShipmentTest {
	
	public static Product door = new Product("Wooden Door",35);
	public static Product floorPanel = new Product("Floor Panel",25);
	public static Product window = new Product("Glass Window",18);
	private Shipment shipment = new Shipment();

	@Test
	public void shouldAddItems() {
		shipment.add(door);
		shipment.add(window);
		
		assertTrue(shipment.contains(door,window));
		
	}

	

	@Test
	public void shouldReplaceItems() {
		shipment.add(door);
		shipment.add(window);
		System.out.println(shipment);
		
		assertTrue(shipment.replace(door,floorPanel));
		System.out.println(shipment);
		
		assertTrue(shipment.contains(floorPanel,window));
		
		
	}
	@Test
	public void shouldNotReplaceMissingItem() {
		shipment.add(window);
		assertFalse(shipment.replace(door, floorPanel));
		
		assertTrue(shipment.contains(window,window));
		
	}
}
