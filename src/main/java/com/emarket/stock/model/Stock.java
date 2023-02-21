package com.emarket.stock.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="stock")
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stock_id")
    private Integer id;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "stock_price")
    private Double stockPrice;


    @Column(name = "stock_start_date")
    private Date stockStartDate;

    @Column(name = "stock_end_date")
    private Date stockEndDate;

    @Column(name = "stock_start_time")
    private Time stockStartTime;

    @Column(name = "stockend_time")
    private Time stockEndTime;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Date getStockStartDate() {
        return stockStartDate;
    }

    public void setStockStartDate(Date stockStartDate) {
        this.stockStartDate = stockStartDate;
    }

    public Date getStockEndDate() {
        return stockEndDate;
    }

    public void setStockEndDate(Date stockEndDate) {
        this.stockEndDate = stockEndDate;
    }

    public Time getStockStartTime() {
        return stockStartTime;
    }

    public void setStockStartTime(Time stockStartTime) {
        this.stockStartTime = stockStartTime;
    }

    public Time getStockEndTime() {
        return stockEndTime;
    }

    public void setStockEndTime(Time stockEndTime) {
        this.stockEndTime = stockEndTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
