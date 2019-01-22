package oc_projects.project6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Users {
    @Id
    @GeneratedValue
    public Integer id;
    public String pseudo;
    public String password;
    public int age;
    public boolean pro;

    public Users() {
    }

    public Users(String pseudo, String password, int age, boolean pro) {
        this.pseudo = pseudo;
        this.password = password;
        this.age = age;
        this.pro = pro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
