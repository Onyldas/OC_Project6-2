package oc_projects.project6.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    public int id;
    public String content;
    @ManyToOne(optional = true)
    @JoinColumn(name="id_user")
    public Users user;
    public Date date;
    public int note;
    @ManyToOne(optional = true)
    @JoinColumn(name="id_site")
    public Site site;


    public Comment(String content, Users user) {
        this.content = content;
        this.user = user;
    }

    public Comment() {
    }
}
