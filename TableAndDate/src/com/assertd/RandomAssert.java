package com.assertd;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RandomAssert {
	
	@Test
	public void trueassert(){
		Assert.assertTrue(true);
	}
	
	@Test
	public void equalsAssert(){
		Assert.assertEquals("test","test");
	}

}
