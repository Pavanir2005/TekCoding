package com.tek.interview.question;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FooTest {
	
	@Test
	public void testAllOrders(){
		try {
			Foo.main(new String[]{});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testException(){
		Calculator cal = new Calculator();
		Order ord = new Order();
		Map<String, Order> orderMap = new HashMap<String, Order>();
		orderMap.put(null, null);
		cal.calculate(orderMap);
		
	}
	
	@Test
	public void testRecords(){
		Calculator cal = new Calculator();
		Order ord = new Order();
		try {
			ord.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Order> orderMap = new HashMap<String, Order>();
		orderMap.put("Order1", ord);
		cal.calculate(orderMap);
	}
	
}
