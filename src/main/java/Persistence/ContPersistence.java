
package Persistence;

import Database.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ContPersistence {
    
    UserJpaController userjpa = new UserJpaController();

    public void createuser(User u) {
        
        userjpa.create(u);
        
    }
    
    public boolean login(String username, String pass){
        
        
        EntityManager o = userjpa.getEntityManager();
        
        Query Q = o.createQuery("select u.username, u.password FROM Usuario u where u.username = :username and u.password = :password");
        
        Q.setParameter("username", username);
        
        Q.setParameter("password", pass);
        
        List Res = Q.getResultList();
        
        return Res.isEmpty(); 
    }
    
}
