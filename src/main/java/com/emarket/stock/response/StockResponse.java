package com.emarket.stock.response;

import com.emarket.stock.model.Stock;

import java.util.List;

public class StockResponse {


    List<Stock> stocks;

    Double minStockPrice;

    Double maxStockPrice;


    Double avgStockPrice;


    public StockResponse(){
        super();

    }

    public StockResponse(List<Stock> stocks,Double minStockPrice,Double maxStockPrice,Double avgStockPrice){

        super();
        this.stocks=stocks;
        this.minStockPrice = minStockPrice;
        this.maxStockPrice = maxStockPrice;
        this.avgStockPrice = avgStockPrice;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public Double getMinStockPrice() {
        return minStockPrice;
    }

    public void setMinStockPrice(Double minStockPrice) {
        this.minStockPrice = minStockPrice;
    }

    public Double getMaxStockPrice() {
        return maxStockPrice;
    }

    public void setMaxStockPrice(Double maxStockPrice) {
        this.maxStockPrice = maxStockPrice;
    }

    public Double getAvgStockPrice() {
        return avgStockPrice;
    }

    public void setAvgStockPrice(Double avgStockPrice) {
        this.avgStockPrice = avgStockPrice;
    }
}
