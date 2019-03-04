package com.novus.hospital.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilityJPA {

	public static final EntityManagerFactory emFactory;
	static { 
		emFactory = Persistence.createEntityManagerFactory("Hospital1");
	}
	
	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
	public static void close() {
		emFactory.close();
		
	}

}
