package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Part {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String catalogueNumber;

    private String partType;

    private String producer;

    protected Part() {}

    public Part(String name, String catalogueNumber, String partType, String producer) {
        this.name = name;
        this.catalogueNumber = catalogueNumber;
        this.partType = partType;
        this.producer = producer;
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

    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    public void setCatalogueNumber(String catalogueNumber) {
        this.catalogueNumber = catalogueNumber;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }






    @Override
    public String toString() {
        return String.format(
                "Part[id=%d, name='%s', catalogueNumber='%s',partType='%s',producer='%s']",
                id, name, catalogueNumber, partType, producer);
    }

}