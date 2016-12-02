package pl.trinitec.form;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class PartOrderForm {


    @NotEmpty(message="Wybierz numer projektu")
    private String Project;
    @NotEmpty(message="Wybierz dostawcę")
    private String supplier;
    @NotEmpty(message="Wybierz adres dostawy") //todo sting czy obiekt??? orderNumber
    private String deliveryAddress;
    @NotEmpty(message="Wpisz numer zamówienia")
    private Long orderNumber;
    @Temporal(TemporalType.DATE)@NotNull(message = "Podaj datę złożenia zamówienia")
    private Date orderPlaceDate;

    @Temporal(TemporalType.DATE)@NotNull(message = "Podaj datę realizacji zamówienia")
    private Date orderCompletionDate;

    @Temporal(TemporalType.DATE)@NotNull(message = "Podaj datę dostarczenia zamówienia")
    private Date orderDeliveryDate;

    private Boolean orderDelivered;
    @NotEmpty(message = "Wybierz metodę płatności")
    private String paymentMethod;
    @NotEmpty(message = "Wybierz sposób dostawy")
    private String deliveryConditions;
    @NotEmpty(message = "Wybierz walutę")
    private String currency;
    @NotEmpty(message = "Wybierz składającego zamówienie")
    private String createdBy;

    private String comments;

    private BigDecimal totalValue;


    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderPlaceDate() {
        return orderPlaceDate;
    }

    public void setOrderPlaceDate(Date orderPlaceDate) {
        this.orderPlaceDate = orderPlaceDate;
    }

    public Date getOrderCompletionDate() {
        return orderCompletionDate;
    }

    public void setOrderCompletionDate(Date orderCompletionDate) {
        this.orderCompletionDate = orderCompletionDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public Boolean getOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(Boolean orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryConditions() {
        return deliveryConditions;
    }

    public void setDeliveryConditions(String deliveryConditions) {
        this.deliveryConditions = deliveryConditions;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "PartOrderForm{" +
                "Project='" + Project + '\'' +
                ", supplier='" + supplier + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPlaceDate=" + orderPlaceDate +
                ", orderCompletionDate=" + orderCompletionDate +
                ", orderDeliveryDate=" + orderDeliveryDate +
                ", orderDelivered=" + orderDelivered +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", deliveryConditions='" + deliveryConditions + '\'' +
                ", currency='" + currency + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", comments='" + comments + '\'' +
                ", totalValue=" + totalValue +
                '}';
    }


}
