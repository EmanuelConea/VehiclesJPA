package daoImplementation;

import java.util.List;
import java.util.Optional;

import javax.persistence.TypedQuery;

import dao.Dao;
import helper.DBHelper;
import model.Vehicle;

public class VehicleDao implements Dao<Vehicle> {

	private DBHelper dbHelper;
	
	public VehicleDao(DBHelper dbHelper) {
		this.dbHelper = dbHelper;
	}
	
	@Override
	public Optional<Vehicle> get(int id){
		return Optional.ofNullable(dbHelper.getEntityManager().find(Vehicle.class, id));
	}
	
	@Override
	public List<Vehicle> getAll(){
		TypedQuery<Vehicle> query = dbHelper.getEntityManager().createQuery("Select a from Vehicle a", Vehicle.class);
		return query.getResultList();
	}
	
	@Override
	public boolean create(Vehicle vehicle) {
		return dbHelper.executeTransaction(entityManager -> entityManager.persist(vehicle));
	}
	
	@Override
	public boolean update(Vehicle old, Vehicle newInst) {
		old.setId(newInst.getId());
		old.setName(newInst.getName());
		old.setEngine(newInst.getEngine());
		old.setProductionYear(newInst.getProductionYear());
		old.setHorsePower(newInst.getHorsePower());
		old.setPrice(newInst.getPrice());
		return dbHelper.executeTransaction(entityManager -> entityManager.merge(old));
	}
	
	@Override
	public boolean delete(Vehicle vehicle) {
		return dbHelper.executeTransaction(entityManager -> entityManager.remove(vehicle));
	}
	
	@Override
	public Vehicle findById(int id) {
		Vehicle toFind = dbHelper.getEntityManager().find(Vehicle.class, id);
		
		return toFind;
	}
	
	@Override
	public void sortByPrice() {
		List<Vehicle> results = dbHelper.getEntityManager()
				.createNativeQuery("Select * from Vehicle order by price", Vehicle.class)
				.getResultList();
		for(Vehicle vehicle : results) {
			System.out.println(vehicle);
		}
	}
	
	@Override
	public void sortByPriceDescending() {
		List<Vehicle> results = dbHelper.getEntityManager()
				.createNativeQuery("Select * from Vehicle order by price DESC", Vehicle.class)
				.getResultList();
		for(Vehicle vehicle : results) {
			System.out.println(vehicle);
		}
	}

	
}
