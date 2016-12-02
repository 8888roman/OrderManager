package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.*;
import java.util.List;


@Entity
public class Address {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy="supplier")
    private List<PartOrder> partOrders;

    private String name;

    private String place;

    private String contact;





}