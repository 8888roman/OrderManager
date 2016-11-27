package pl.trinitec.form;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class PartForm {



    @NotEmpty(message="Wpisz nazwę części")
    private String name;
    @NotEmpty(message="Wpisz numer katalogowy")
    private String catalogueNumber;
    @NotEmpty(message="Wpisz typ części")
    private String partType;
    @NotEmpty(message="Wpisz nazwę producenta")
    private String producer;


    public  String getName() {
        return name;
    }public void   setName(String name) {
        this.name = name;
    }public String getCatalogueNumber() {
        return catalogueNumber;
    }public void   setCatalogueNumber(String catalogueNumber) {
        this.catalogueNumber = catalogueNumber;
    }public String getPartType() {
        return partType;
    }public void   setPartType(String partType) {
        this.partType = partType;
    }public String getProducer() {
        return producer;
    }public void   setProducer(String producer) {
        this.producer = producer;
    }

@Override
public String toString(){
    return String.format(
            "Part[name='%s', catalogueNumber='%s',partType='%s',producer='%s']",
            name, catalogueNumber, partType, producer);
}

}
