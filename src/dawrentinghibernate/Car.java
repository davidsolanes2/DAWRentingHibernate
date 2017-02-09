package dawrentinghibernate;
// Generated 09-feb-2017 19:56:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Car generated by hbm2java
 */
public class Car  implements java.io.Serializable {


     private String idcar;
     private Driver driver;
     private String model;
     private int capacity;
     private Set rentals = new HashSet(0);

    public Car() {
    }

	
    public Car(String idcar, Driver driver, String model, int capacity) {
        this.idcar = idcar;
        this.driver = driver;
        this.model = model;
        this.capacity = capacity;
    }
    public Car(String idcar, Driver driver, String model, int capacity, Set rentals) {
       this.idcar = idcar;
       this.driver = driver;
       this.model = model;
       this.capacity = capacity;
       this.rentals = rentals;
    }
   
    public String getIdcar() {
        return this.idcar;
    }
    
    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }
    public Driver getDriver() {
        return this.driver;
    }
    
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public int getCapacity() {
        return this.capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Set getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set rentals) {
        this.rentals = rentals;
    }




}


