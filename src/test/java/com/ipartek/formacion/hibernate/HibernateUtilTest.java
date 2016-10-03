package com.ipartek.formacion.hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HibernateUtilTest {

	@Test
	public void test() {

		Session session = HibernateUtil.getSession();
		assertNotNull("NO se puede obtener session Hibernate, la configuración no es correcta o la BBDD está parada",
				session);
	}

}
