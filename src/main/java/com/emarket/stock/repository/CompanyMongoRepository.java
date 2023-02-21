package com.emarket.stock.repository;

import com.emarket.stock.model.CompanyDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMongoRepository extends MongoRepository<CompanyDocument, String> {

    public CompanyDocument findByCompanyCode(String companyCode);
}
