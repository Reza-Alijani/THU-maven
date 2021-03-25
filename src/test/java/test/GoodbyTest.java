package test;

import org.junit.Test;

import maven.Goodby;


public class GoodbyTest {
	
	@Test
	public void test() {
		Goodby goodby = new Goodby();
		assert(goodby.isAlive());
	}
	

}
