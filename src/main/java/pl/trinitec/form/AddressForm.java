package pl.trinitec.form;



import org.hibernate.validator.constraints.NotEmpty;
import pl.trinitec.domain.PartOrder;
import pl.trinitec.domain.Supplier;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class AddressForm {


    @NotEmpty(message = "Wpisz nazwę")
    private String name;

    @NotEmpty(message = "Wpisz adres")
    private String place;

   // @NotEmpty(message = "Podaj osobę kontaktową")
    private String contact;


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
        return "AddressForm{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
