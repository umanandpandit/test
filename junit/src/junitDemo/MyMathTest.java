package junitDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();	
	
	
	
	@Test
	public void sum_with3numbers() {
		System.out.println("TestWith3");
		assertEquals(6,myMath.sum(new int[]{1,2,3}));
	}
	@Test
	public void sum_with1numbers() {
		System.out.println("TestWith1");
		assertEquals(3,myMath.sum(new int[]{3}));
	}
	

}
