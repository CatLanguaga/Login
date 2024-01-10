
package Database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

//Entity class of users

@Entity
public class User implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String username;
    
    private String password;
    
    @Temporal(TemporalType.DATE)
    private Date date;

    public User(int id, String username, String password, Date date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.date = date;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }   
}
