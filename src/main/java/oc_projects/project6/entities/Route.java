package oc_projects.project6.entities;

import javax.persistence.*;

@Entity
public class Route {

    @Id
    @GeneratedValue
    public int id;
    @ManyToOne
    @JoinColumn(name="id_site")
    public Site site;
    public String cotation;
    public int nbSpits;

    public Route(Site site, String cotation, int nbSpits) {
        this.site = site;
        this.cotation = cotation;
        this.nbSpits = nbSpits;
    }

    public Route() {
    }
}
