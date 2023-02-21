package com.emarket.stock.repository;

import com.emarket.stock.model.StockDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface StockMongoRepository extends MongoRepository<StockDocument, Integer> {

    @Query(value="{ 'companyCode' : ?0 , 'startDate' :{ $gt: ?1 , $lt: ?2} }")
    public List<StockDocument> getStocksByDate(String companyCode, Date startDate,Date endDate);

}

