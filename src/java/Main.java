
import ModeloPersonal.ClaseT_Personal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.config.ParserType;

/*
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DirectorioAngieePU");   
        EntityManager em = emf.createEntityManager();
        
        
        em.getTransaction().begin();
        
//        ClaseT_Personal p = new ClaseT_Personal();
//        p.setNombre("Angiee");
//        p.setTelefono("123456".toString());
//       
//        em.persist(p);
//        em.getTransaction().commit();
       
        ClaseT_Personal clasePersonal = em.find(ClaseT_Personal.class, 1);
        System.out.println("Su teléfono es: "+clasePersonal.getTelefono());
        em.close();
        emf.close();
        
        
      
   }
    
}
