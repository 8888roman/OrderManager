package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
public class Part {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JoinColumn(name = "part_ID")
    private Long id;

    @JoinTable(name="part_partOrder",
            joinColumns={@JoinColumn(name="partOrder_ID")},
            inverseJoinColumns={@JoinColumn(name="part_ID")})
    @ManyToMany(mappedBy = "parts")
    private List<PartOrder> partOrders;

    private String name;

    private String catalogueNumber;

    private String description;

    private String unit;

    private BigDecimal quantity;

    private BigDecimal pricePerUnit;

    private BigDecimal exchangeRate;

    private BigDecimal nettoValue;

    private BigDecimal discount;

    private BigDecimal partTotalValue;



    protected Part() {}

    public Part( String name, String catalogueNumber, String description, String unit, BigDecimal quantity, BigDecimal pricePerUnit, BigDecimal exchangeRate, BigDecimal nettoValue, BigDecimal discount, BigDecimal partTotalValue) {



        this.name = name;
        this.catalogueNumber = catalogueNumber;
        this.description = description;
        this.unit = unit;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.exchangeRate = exchangeRate;
        this.nettoValue = nettoValue;
        this.discount = discount;
        this.partTotalValue = partTotalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<PartOrder> getPartOrders() {
        return partOrders;
    }

    public void setPartOrders(List<PartOrder> partOrders) {
        this.partOrders = partOrders;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getNettoValue() {
        return nettoValue;
    }

    public void setNettoValue(BigDecimal nettoValue) {
        this.nettoValue = nettoValue;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPartTotalValue() {
        return partTotalValue;
    }

    public void setPartTotalValue(BigDecimal partTotalValue) {
        this.partTotalValue = partTotalValue;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partOrders=" + partOrders +
                ", name='" + name + '\'' +
                ", catalogueNumber='" + catalogueNumber + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                ", exchangeRate=" + exchangeRate +
                ", nettoValue=" + nettoValue +
                ", discount=" + discount +
                ", partTotalValue=" + partTotalValue +
                '}';
    }
}