package mk.finki.ukim.mk.lab.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "manufacturers")
public class Manufacturer {
    @Id
    private Long id;
    private String name;
    private String country;

    @Column(name = "manufacturer_address")
    private String address;
}
