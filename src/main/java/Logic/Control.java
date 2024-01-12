
package Logic;

import Database.User;
import Persistence.ContPersistence;


public class Control {
    
    ContPersistence cont = new ContPersistence();
    
    
    
    public void CreateUser(User u){
        
        cont.createuser(u);
        
    }
    
    public boolean login(String username, String pass){
        
        return cont.login(username, pass);
        
    }
}
