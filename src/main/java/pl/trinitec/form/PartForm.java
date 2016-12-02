package pl.trinitec.form;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import pl.trinitec.domain.PartOrder;
import pl.trinitec.domain.Supplier;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PartForm {


    private Supplier supplier;

    private PartOrder partOrder;

    @NotEmpty(message="Wpisz nazwę części")
    private String name;

    @NotEmpty(message="Wpisz numer katalogowy")
    private String catalogueNumber;

    @NotEmpty(message="Podaj opis części")
    private String description;


    private String unit;

    @NotNull(message="Podaj ilość")
    private BigDecimal quantity;

    @NotNull(message="Podaj cenę jednostkową")
    private BigDecimal pricePerUnit;

    @NotNull(message="Podaj kurs")
    private BigDecimal exchangeRate;

    @NotNull(message="Podaj cenę netto")
    private BigDecimal nettoValue;

    @NotNull(message="Podaj wartość rabatu")
    private BigDecimal discount;


    private BigDecimal partTotalValue;
    
    @NotNull
    private Long supplierId;


    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public PartOrder getPartOrder() {
        return partOrder;
    }

    public void setPartOrder(PartOrder partOrder) {
        this.partOrder = partOrder;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "PartForm{" +
                "supplier=" + supplier +
                ", partOrder=" + partOrder +
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
                ", supplierId=" + supplierId +
                '}';
    }
}
// TODO: 29.11.16 dodac toString dla supplierId 