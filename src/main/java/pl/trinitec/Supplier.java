package pl.trinitec;

/**
 * Created by AN-KOP on 2016-11-19.
 */
        import javax.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String name2;
    @Column
    private String taxIdNumber;
    @Column
    private String address;
    @Column
    private String zipCode;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private String contactPerson;
    @Column
    private String email;
    @Column
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



    @Override
    public String toString() {
        return String.format(
                "Supplier[id=%d, name='%s', name2='%s',taxIdNumber='%s',address='%s',zipCode='%s',city='%s',country='%s',contactPerson='%s', email='%s', phoneNumber='%s']",
                id, name, name2, taxIdNumber, address, zipCode, city, country, contactPerson, email, phoneNumber  );
    }

}