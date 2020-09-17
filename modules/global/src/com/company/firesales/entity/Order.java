package com.company.firesales.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Table(name = "FIRESALES_ORDER")
@Entity(name = "firesales_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 209700099408203601L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {})
    private Customer customer;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    @Lookup(type = LookupType.DROPDOWN, actions = {})
    private Product product;

    @Column(name = "NUMBER_OF_ITEMS")
    @Positive
    private Integer numberOfItems;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}