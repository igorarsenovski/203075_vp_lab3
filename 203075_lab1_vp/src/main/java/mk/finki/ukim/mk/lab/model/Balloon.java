package mk.finki.ukim.mk.lab.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Balloon {
    @Id
    private Long id;
    private String name;
    private String description;


    @ManyToOne
    private Manufacturer manf;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
