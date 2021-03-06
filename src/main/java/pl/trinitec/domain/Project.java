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

    private String projectNumber;

    @OneToMany(mappedBy="project")
    private List<PartOrder> partOrder;

    private BigDecimal projectValue;


    protected Project() {}


    public Project(String projectNumber, List<PartOrder> partOrder, BigDecimal projectValue) {
        this.projectNumber = projectNumber;
        this.partOrder = partOrder;
        this.projectValue = projectValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public List<PartOrder> getPartOrder() {
        return partOrder;
    }

    public void setPartOrder(List<PartOrder> partOrder) {
        this.partOrder = partOrder;
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
                ", projectNumber='" + projectNumber + '\'' +
                ", partOrder=" + partOrder +
                ", projectValue=" + projectValue +
                '}';
    }
}