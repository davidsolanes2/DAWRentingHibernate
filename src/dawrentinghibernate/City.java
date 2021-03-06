package dawrentinghibernate;
// Generated 09-feb-2017 19:56:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * City generated by hbm2java
 */
public class City  implements java.io.Serializable {


     private String postalcode;
     private String name;
     private Set rentals = new HashSet(0);

    public City() {
    }

	
    public City(String postalcode, String name) {
        this.postalcode = postalcode;
        this.name = name;
    }
    public City(String postalcode, String name, Set rentals) {
       this.postalcode = postalcode;
       this.name = name;
       this.rentals = rentals;
    }
   
    public String getPostalcode() {
        return this.postalcode;
    }
    
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set rentals) {
        this.rentals = rentals;
    }




}


