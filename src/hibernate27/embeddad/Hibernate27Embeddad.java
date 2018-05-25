
package hibernate27.embeddad;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Hibernate27Embeddad {

    public static void main(String[] args) {
    
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            try{
        
                Transaction  trans = session.beginTransaction();
                Adres adres = new Adres("Turgut reis","Karaosmnaoğlu","2864");
                Employee emp = new Employee("Sercan YERGOK","Yazılm Mühen",adres);
                
                session.save(emp);
                trans.commit();
                session.close();
                
                
                
                
                    
        }catch(Exception ew){
        
        }
        
        
        
    }
    
}
