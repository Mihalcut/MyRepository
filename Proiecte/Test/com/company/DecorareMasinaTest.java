package com.company;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.omg.CORBA.portable.InputStream;

/**
*
* @author Mihalcut, Dragomir
* 
* @deprecated
* Testarea decoratorilor
*
*/

public class DecorareMasinaTest {

	@Test
	public void testDecorare() {
		DecorareMasina masina=new DecorareMasina();
		assertNotNull(masina);
		
	}

	@Test
	public void testMain() throws FileNotFoundException {
		/*System.out.println("main");
	    String[] args = null;
	    final java.io.InputStream original =  System.in;
	    final FileInputStream fips = new FileInputStream(new File("[path_to_file]"));
	    System.setIn(fips);
	    Main.main(args);
	    System.setIn(original);
	    */
	}

}
