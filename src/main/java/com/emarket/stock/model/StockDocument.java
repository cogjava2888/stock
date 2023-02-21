package com.emarket.stock.model;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document("stock")
public class StockDocument {
    @Id
    private String id;
    private Integer stockId;
    private String companyCode;
    private Double stockPrice;
    private Date stockStartDate;
    private Date stockEndDate;
    private String stockStartTime;
    private String stockEndTime;


    public StockDocument(){
        super();
    }

    public StockDocument(String id, Integer stockId,String companyCode,Double stockPrice,Date stockStartDate,Date stockEndDate,String stockStartTime, String stockEndTime){
        super();
        this.id = id;
        this.stockId = stockId;
        this.stockPrice = stockPrice;
        this.companyCode = companyCode;
        this.stockStartDate = stockStartDate;
        this.stockEndDate = stockEndDate;
        this.stockStartTime = stockStartTime;
        this.stockEndTime = stockEndTime;

    }

    public StockDocument(Integer id,String companyCode,Double stockPrice,Date stockStartDate,Date stockEndDate,String stockStartTime, String stockEndTime){
        super();
        this.stockId = id;
        this.stockPrice = stockPrice;
        this.companyCode = companyCode;
        this.stockStartDate = stockStartDate;
        this.stockEndDate = stockEndDate;
        this.stockStartTime = stockStartTime;
        this.stockEndTime = stockEndTime;

    }
}
