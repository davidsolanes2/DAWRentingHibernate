/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawrentinghibernate;

/**
 *
 * @author mfontana
 */
public class DAWRentingHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RentingORM gestor = new RentingORM();
        System.out.println("Establecida la sesión con Hibernate...");
        City c = new City("08004", "Barcelona");
        gestor.insertCity(c);
        System.out.println("Ciudad insertada.");
        c.setName("Pepe");
        gestor.updateCity(c);
        System.out.println("Ciudad modificada");
    }
    
}
