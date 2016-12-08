package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;


@Entity
public class Address {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy="deliveryAddress")
    private List<PartOrder> partOrders;

    private String name;

    private String place;

    private String contact;

    public Address() {
    }

    public Address( String name, String place, String contact) {

        this.name = name;
        this.place = place;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", partOrders=" + partOrders +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}