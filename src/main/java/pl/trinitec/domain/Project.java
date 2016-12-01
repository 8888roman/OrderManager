package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
public class Project {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="project")
    private List<Order> orders;

    private BigDecimal projectValue;


    protected Project() {}

    public Project(List<Order> orders, BigDecimal projectValue) {
        this.orders = orders;
        this.projectValue = projectValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public BigDecimal getProjectValue() {
        return projectValue;
    }

    public void setProjectValue(BigDecimal projectValue) {
        this.projectValue = projectValue;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", orders=" + orders +
                ", projectValue=" + projectValue +
                '}';
    }
}