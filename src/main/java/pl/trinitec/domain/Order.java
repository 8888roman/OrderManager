package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
public class Order {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Supplier supplier;

    private List<Part> parts;





    protected Order() {}





}