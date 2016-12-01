package pl.trinitec.domain;

/**
 * Created by AN-KOP on 2016-11-19.
 */

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
public class PartOrder {




    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Address deliveryAddress;

    private String orderNumber;

    @Temporal(TemporalType.DATE)
    private Date orderPlaceDate;

    @Temporal(TemporalType.DATE)
    private Date orderCompletionDate;

    @Temporal(TemporalType.DATE)
    private Date orderDeliveryDate;

    private Boolean orderDelivered;

    private String paymentMethod;

    private String deliveryConditions;

    private String currency;

    private String createdBy;

    private String comments;

    private BigDecimal totalValue;





    protected PartOrder() {}


    public PartOrder(Supplier supplier, Address address, String orderNumber, Date orderPlaceDate, Date orderCompletionDate,
                     Date orderDeliveryDate, Boolean orderDelivered, String paymentMethod, String deliveryConditions, String currency,
                     String createdBy, String comments, BigDecimal totalValue, Project project) {
        this.supplier = supplier;
        this.deliveryAddress = address;
        this.orderNumber = orderNumber;
        this.orderPlaceDate = orderPlaceDate;
        this.orderCompletionDate = orderCompletionDate;
        this.orderDeliveryDate = orderDeliveryDate;
        this.orderDelivered = orderDelivered;
        this.paymentMethod = paymentMethod;
        this.deliveryConditions = deliveryConditions;
        this.currency = currency;
        this.createdBy = createdBy;
        this.comments = comments;
        this.totalValue = totalValue;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    public Project getProject() {
        return project;
    }

    public void setProject(Project  project) {
        this.project = project;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
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
        return "Order{" +
                "id=" + id +
                ", project=" + project +
                ", supplier=" + supplier +
                ", deliveryAddress=" + deliveryAddress +
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