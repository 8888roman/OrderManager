package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;


@Entity
public class Part {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long projectId;

    private Long orderId;

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

    public Part(String name, String catalogueNumber, String description, String unit, BigDecimal quantity, BigDecimal pricePerUnit,
                BigDecimal exchangeRate, BigDecimal nettoValue, BigDecimal discount, BigDecimal partTotalValue ) {
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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
        this.unit  = unit;
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
        return String.format(
                "Part[id=%d, projectId=%d, orderId=%d, name='%s', catalogueNumber='%s',description='%s',unit='%s', quantity='%d',pricePerUnit='%d',exchangeRate='%d',nettoValue='%d',discount='%d',partTotalValue='%d']",
                id, projectId, orderId, name, catalogueNumber, description, unit, quantity, pricePerUnit, exchangeRate, nettoValue, discount, partTotalValue );
    }

}