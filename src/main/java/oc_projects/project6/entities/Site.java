package oc_projects.project6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Site {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String description;
    public Date date;
    public String level;
    public int altitude;
    public String adresse;


    public Site(String name, String description, Date date, String level, int altitude, String adresse) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.level = level;
        this.altitude = altitude;
        this.adresse = adresse;
    }

    public Site() {
    }
}
