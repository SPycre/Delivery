package delivery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDelivery {

	@Test
	void testDeliveriesWhen10() {
		Delivery delivery = new Delivery(50,9);
		assertEquals(10,delivery.getPrix());
	}
	
	@Test
	void testDeliveriesWhen10WithMajration() {
		Delivery delivery = new Delivery(50,10);
		assertEquals(12,delivery.getPrix());
		
		delivery = new Delivery(50,26);
		assertEquals(15,delivery.getPrix());
	}
	
	@Test
	void testDeliveriesWhen10AndDistance() {
		Delivery delivery = new Delivery(52,9);
		assertEquals(11,delivery.getPrix());
	}
	
	@Test
	void testDeliveriesWhen10AndDistanceMajoration() {
		Delivery delivery = new Delivery(52,10);
		assertEquals(13,delivery.getPrix());
		
		delivery = new Delivery(52,26);
		assertEquals(16,delivery.getPrix());
	}

}
