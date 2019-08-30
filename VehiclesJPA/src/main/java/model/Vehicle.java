package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Vehicle.findAll", query="SELECT a FROM Vehicle a")
public class Vehicle implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date productionYear;
	
	private String name;
	
	private Integer horsePower;
	
	private String engine;
	
	private Integer price;
	
	public Vehicle() {
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}
	
	public Date getProductionYear() {
		return this.productionYear;
	}
	
	public Integer getHorsePower() {
		return this.horsePower;
	}
	
	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return id + " " + name  + " " + productionYear + " " + horsePower + " " + engine + " " + price;
	}
	
}
