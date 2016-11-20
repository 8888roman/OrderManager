package pl.trinitec;

/**
 * Created by AN-KOP on 2016-11-19.
 */
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String name2;
    private String zipCode;

    protected Supplier() {}

    public Supplier(String name, String name2, String zipCode) {
        this.name = name;
        this.name2 = name2;
        this.zipCode = zipCode;
    }



    @Override
    public String toString() {
        return String.format(
                "Supplier[id=%d, name='%s', zipCode='%s']",
                id, name, zipCode);
    }

}