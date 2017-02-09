/*
 * Clase encargada de la persistencia con Hibernate
 */
package dawrentinghibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mfontana
 */
public class RentingORM {
    
    // Variable para poder trabajar con la bbdd
    private Session sesion;
    
    // Variable para las transacciones con datos
    private Transaction tx;

    public RentingORM() {
        sesion = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void insertCity(City c) {
        tx = sesion.beginTransaction();
        sesion.save(c);
        tx.commit();
    }
    
    public void updateCity(City c) {
        tx = sesion.beginTransaction();
        sesion.update(c);
        tx.commit();
    }
    
    public void deleteCity(City c) {
        tx = sesion.beginTransaction();
        sesion.delete(c);
        tx.commit();
    }
    
    public List<City> selectAllCity() {
        Query q = sesion.createQuery("select c from City c");
        return q.list();
    }
    
    public List<String> selectNameCity() {
        return sesion.createQuery("select c.name from City c").list();
    }
    
}
