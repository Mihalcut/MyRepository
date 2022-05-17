package com.company;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
*
* @author Mihalcut, Dragomir
* 
* @deprecated
* Testarea decoratorilor
*
*/
public class AdaugaCombustibilTest {
	Car c;
	AdaugaMotorina m=new AdaugaMotorina(c);
	@Test
	public void testAdaugaCombustibil() {
		AdaugaMotorina a=new AdaugaMotorina(c);
		assertNotSame(a,m);
	}

	@Test
	public void testDescrie() {
		assertNotNull(c);
	}
	@Test
	public void testSetCuloare() {
		AdaugaMotorina a=new AdaugaMotorina(c);
		assertNotSame(a,m);
	}

	@Test
	public void testAddPret() {
		AdaugaMotorina a=new AdaugaMotorina(c);
		assertNotSame(a,m);
	}

	@Test
	public void testSetCombustibil() {
		AdaugaMotorina a=new AdaugaMotorina(c);
		assertNotSame(a,m);
	}

}
