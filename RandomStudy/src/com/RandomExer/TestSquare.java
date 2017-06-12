package com.RandomExer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {
	
	int value1 = 25;
	int value2 = 625;

	
	
	@Test
	public void testSquare() throws InterruptedException
	{
		// Thread.sleep(500);
		squarevalue sq = new squarevalue();
		assertEquals(value2, sq.squareOf(24));
		
		
	}
	
	

}
