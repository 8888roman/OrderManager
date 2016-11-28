package pl.trinitec.form;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PartForm {



    @NotEmpty(message="Wpisz nazwę części")
    private String name;

    @NotEmpty(message="Wpisz numer katalogowy")
    private String catalogueNumber;

    @NotEmpty(message="Podaj opis części")
    private String description;

    @NotEmpty(message="Wpisz nazwę producenta")
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
public String toString(){
    return String.format(
            "Part[name='%s', catalogueNumber='%s',description='%s',unit='%s', quantity='%d',pricePerUnit='%d',exchangeRate='%d',nettoValue='%d',discount='%d',partTotalValue='%d']",
             name, catalogueNumber, description, unit, quantity, pricePerUnit, exchangeRate, nettoValue, discount, partTotalValue );
    }

}
