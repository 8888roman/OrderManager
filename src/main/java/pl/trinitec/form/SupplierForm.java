package pl.trinitec.form;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import sun.plugin2.message.Message;

import javax.validation.constraints.Min;

public class SupplierForm {

//    @Min(3)
    @NotEmpty(message="Wpisz nazwę dostawcy")
    private String name;
    private String name2;
    @NotEmpty(message="Wpisz NIP")
    private String taxIdNumber;
    @NotEmpty(message="Wpisz adres")
    private String address;
    @NotEmpty(message="Wpisz kod pocztowy")
    private String zipCode;
    @NotEmpty(message="Wpisz miasto")
    private String city;
    @NotEmpty(message="Wpisz kraj")
    private String country;
    @NotEmpty(message="Uzupełnij osobę kontaktową")
    private String contactPerson;
    @NotEmpty(message="podaj email")
    @Email(message="podaj poprawny email")
    private String email;
    @NotEmpty(message="Podaj numer telefonu")
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




@Override
public String toString(){
    return String.format(
            "Supplier[name='%s', name2='%s',taxIdNumber='%s',address='%s',zipCode='%s',city='%s',country='%s',contactPerson='%s', email='%s', phoneNumber='%s']",
             name, name2, taxIdNumber, address, zipCode, city, country, contactPerson, email, phoneNumber  );
}





    //dodac toString
}
