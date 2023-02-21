package com.emarket.stock.services;

import com.emarket.stock.model.Stock;
import com.emarket.stock.repository.StockRepository;
import com.emarket.stock.response.StockResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.sql.Time;
import java.time.Instant;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public int  addStocks(String companyCode, Double stockPrice){
       try{

           GregorianCalendar gCalendar = new GregorianCalendar();
           @SuppressWarnings("deprecation")
           Time t = new Time(gCalendar.get(Calendar.HOUR),gCalendar.get(Calendar.MINUTE),gCalendar.get(Calendar.SECOND));

           Stock stock = new Stock();
           stock.setCompanyCode(companyCode);
           stock.setStockPrice(stockPrice);
           stock.setStockStartDate(Time.from(Instant.now()));
           stock.setStockEndDate(new Date());
           stock.setStockStartTime(t);
           stock.setStockEndTime(t);


           stockRepository.save(stock);

           return 1;

       }catch(Exception e ){
           e.printStackTrace();
       }
       return 0;
    }



    public StockResponse getStocksByDate(String companyCode, java.sql.Date startDate , java.sql.Date endDate){

        StockResponse response = new StockResponse();

        List<Stock> stockList = stockRepository.getStocksByDate(companyCode,startDate,endDate);
        if(stockList!= null && !stockList.isEmpty()){

            List<Double> stockPrices = stockList.stream().map(Stock::getStockPrice).collect(Collectors.toList());

            Double minStockPrice = stockPrices.stream().min(Comparator.naturalOrder()).get();
            Double maxStockPrice = stockPrices.stream().max(Comparator.naturalOrder()).get();
            Double avgStockPrice = stockPrices.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);


            response.setStocks(stockList);
            response.setMinStockPrice(minStockPrice);
            response.setMaxStockPrice(maxStockPrice);
            response.setAvgStockPrice(avgStockPrice);


        }

        return response;

    }
}
