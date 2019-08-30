package controller;

import java.util.Date;
import java.util.List;

import daoImplementation.VehicleDao;
import helper.DBHelper;
import model.Vehicle;

public class VehicleController {

	static DBHelper dhDacia = DBHelper.getInstance("Dacia");
	static DBHelper dhMan = DBHelper.getInstance("Man");
	static DBHelper dhVolkswagen = DBHelper.getInstance("Volkswagen");
	
	VehicleDao daciaDao = new VehicleDao(dhDacia);
	VehicleDao manDao = new VehicleDao(dhMan);
	VehicleDao volkswagenDao = new VehicleDao(dhVolkswagen);
	
	public void printDaciaList() {
		List<Vehicle> list = daciaDao.getAll();
		
		for(Vehicle vehicle : list) {
			System.out.println(vehicle.toString());
		}
	}
	
	public void createDacia(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
		if(daciaDao.get(id).isPresent() == true) {
			System.out.println("Already present in system");
		}
		
		Vehicle newVehicle = new Vehicle();
		newVehicle.setId(id);
		newVehicle.setEngine(engine);
		newVehicle.setHorsePower(horsePower);
		newVehicle.setName(name);
		newVehicle.setProductionYear(productionYear);
		newVehicle.setPrice(price);
		
		daciaDao.create(newVehicle);
	}
	
	public void findDacia(int id) {
		System.out.println(daciaDao.findById(id));
	}
	
	public void updateDacia(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
	Vehicle toFind = daciaDao.findById(id);
	Vehicle newVehicle = new Vehicle();
	
	newVehicle.setId(id);
	newVehicle.setEngine(engine);
	newVehicle.setHorsePower(horsePower);
	newVehicle.setName(name);
	newVehicle.setProductionYear(productionYear);
	newVehicle.setPrice(price);
	
	daciaDao.create(newVehicle);
	daciaDao.update(toFind, newVehicle);
	}
	
	public void deleteDacia(int id) {
		Vehicle toFind = daciaDao.findById(id);
		
		daciaDao.delete(toFind);
	}
	
	public void printManList() {
		List<Vehicle> list = manDao.getAll();
		
		for(Vehicle vehicle : list) {
			System.out.println(vehicle.toString());
		}
	}
	
	public void createMan(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
		if(manDao.get(id).isPresent() == true) {
			System.out.println("Already present in system");
		}
		
		Vehicle newVehicle = new Vehicle();
		newVehicle.setId(id);
		newVehicle.setEngine(engine);
		newVehicle.setHorsePower(horsePower);
		newVehicle.setName(name);
		newVehicle.setProductionYear(productionYear);
		newVehicle.setPrice(price);
		
		manDao.create(newVehicle);
	}
	
	public void findMan(int id) {
		System.out.println(manDao.findById(id));
	}
	
	public void updateMan(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
	Vehicle toFind = manDao.findById(id);
	Vehicle newVehicle = new Vehicle();
	
	newVehicle.setId(id);
	newVehicle.setEngine(engine);
	newVehicle.setHorsePower(horsePower);
	newVehicle.setName(name);
	newVehicle.setProductionYear(productionYear);
	newVehicle.setPrice(price);
	
	manDao.create(newVehicle);
	manDao.update(toFind, newVehicle);
	}
	
	public void deleteMan(int id) {
		Vehicle toFind = manDao.findById(id);
		
		manDao.delete(toFind);
	}
	
	public void printVolkswagenList() {
		List<Vehicle> list = volkswagenDao.getAll();
		
		for(Vehicle vehicle : list) {
			System.out.println(vehicle.toString());
		}
	}
	
	public void createVolkswagen(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
		if(volkswagenDao.get(id).isPresent() == true) {
			System.out.println("Already present in system");
		}
		
		Vehicle newVehicle = new Vehicle();
		newVehicle.setId(id);
		newVehicle.setEngine(engine);
		newVehicle.setHorsePower(horsePower);
		newVehicle.setName(name);
		newVehicle.setProductionYear(productionYear);
		newVehicle.setPrice(price);
		
		volkswagenDao.create(newVehicle);
	}
	
	public void findVolkswagen(int id) {
		System.out.println(volkswagenDao.findById(id));
	}
	
	public void updateVolkswagen(int id, String name, String engine, Date productionYear, Integer horsePower, Integer price) {
	Vehicle toFind = volkswagenDao.findById(id);
	Vehicle newVehicle = new Vehicle();
	
	newVehicle.setId(id);
	newVehicle.setEngine(engine);
	newVehicle.setHorsePower(horsePower);
	newVehicle.setName(name);
	newVehicle.setProductionYear(productionYear);
	newVehicle.setPrice(price);
	
	volkswagenDao.create(newVehicle);
	volkswagenDao.update(toFind, newVehicle);
	}
	
	public void deleteVolkswagen(int id) {
		Vehicle toFind = daciaDao.findById(id);
		
		volkswagenDao.delete(toFind);
	}
	
	public void sortDaciaList() {
		daciaDao.sortByPrice();
	}
	
	public void sortManList() {
		manDao.sortByPrice();
	}
	
	public void sortVolkswagenList() {
		volkswagenDao.sortByPrice();
	}
	
	public void sortDaciaLisDesct() {
		daciaDao.sortByPriceDescending();
	}
	
	public void sortManListDesc() {
		manDao.sortByPriceDescending();
	}
	
	public void sortVolkswagenListDesc() {
		volkswagenDao.sortByPriceDescending();
	}
}
