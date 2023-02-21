package com.emarket.stock.repository;

import com.emarket.stock.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Integer> {


     Company findByCompanyCode(String companyCode);


     }
