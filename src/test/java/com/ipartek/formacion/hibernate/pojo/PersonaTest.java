package com.ipartek.formacion.hibernate.pojo;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.hibernate.HibernateUtil;

public class PersonaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertar() {

		Session session = HibernateUtil.getSession();

		Persona pepe = new Persona();
		pepe.setNombre("Pepe Gorriti");

		session.beginTransaction();

		session.save(pepe);

		session.getTransaction().commit();

		session.close();

	}

}
