package com.emarket.stock.repository;

import com.emarket.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer> {


    @Query("SELECT s from Stock s WHERE s.companyCode =:companyCode "
    +"AND s.stockStartDate BETWEEN :startDate AND :endDate")
    public List<Stock> getStocksByDate(String companyCode, Date startDate , Date endDate);


}
