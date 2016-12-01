package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */
        import org.hibernate.validator.constraints.Email;
        import org.hibernate.validator.constraints.NotEmpty;

        import javax.persistence.*;
        import javax.validation.constraints.Min;
        import javax.validation.constraints.Size;
        import java.util.List;


@Entity
public class Supplier {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="supplier")
    private List<Part> parts;

    @OneToMany(mappedBy="supplier")
    private List<PartOrder> partOrders;

    private String name;

    private String name2;

    private String taxIdNumber;

    private String address;

    private String zipCode;

    private String city;

    private String country;

    private String contactPerson;

    private String email;

    private String phoneNumber;

    protected Supplier() {}

    public Supplier(String name, String name2, String taxIdNumber, String address,  String zipCode, String city, String country, String contactPerson, String email, String phoneNumber) {
        this.name = name;
        this.name2 = name2;
        this.taxIdNumber = taxIdNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.contactPerson = contactPerson;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
    public String toString() {
        return String.format(
                "Supplier[id=%d, name='%s', name2='%s',taxIdNumber='%s',address='%s',zipCode='%s',city='%s',country='%s',contactPerson='%s', email='%s', phoneNumber='%s']",
                id, name, name2, taxIdNumber, address, zipCode, city, country, contactPerson, email, phoneNumber  );
    }

}