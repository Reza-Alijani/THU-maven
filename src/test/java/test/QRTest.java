package test;

import static org.junit.Assert.*;

import java.io.File;



import org.junit.Test;


public class QRTest {
	
	

	@Test
	public void test() {
		String resourceName = "qr.png";

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		assertTrue(absolutePath.endsWith(".png"));
	}

}
