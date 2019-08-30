package helper;

import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DBHelper {
	
	private DBHelper() {
		
	}
	
	private static DBHelper daciaInstance;
	private static DBHelper manInstance;
	private static DBHelper volkswagenInstance;
	
	public static DBHelper getInstance(String instanceName) {
		switch(instanceName){
			case "Dacia": {
				if(daciaInstance == null) {
					daciaInstance = new DBHelper();
					daciaInstance.init("dacia");
				}
				return daciaInstance;
			}
			case "Man":{
				if(manInstance == null) {
					manInstance = new DBHelper();
					manInstance.init("man");
				}
				return manInstance;
			}
			
			case "Volkswagen":{
				if(volkswagenInstance == null) {
					volkswagenInstance = new DBHelper();
					volkswagenInstance.init("volkswagen");
				}
				return volkswagenInstance;
			}
			
			
		}
		return null;
	}
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public boolean executeTransaction(Consumer<EntityManager> action) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		try {
			entityTransaction.begin();
			action.accept(entityManager);
			entityTransaction.commit();
		}catch(RuntimeException e) {
			System.err.println("Transaction error: " + e.getLocalizedMessage());
			entityTransaction.rollback();
			return false;
		}
		return true;
	}
	
	private boolean init(String dbString) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory(dbString);
			entityManager = entityManagerFactory.createEntityManager();
		}catch(Exception e) {
			System.err.println("Error at initializing DB Manager: " + e.getMessage().toString());
			return false;
		}
		
		return true;
	}

}
