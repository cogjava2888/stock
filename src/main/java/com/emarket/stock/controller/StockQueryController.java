package com.emarket.stock.controller;


import com.emarket.stock.response.StockResponse;
import com.emarket.stock.services.StockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


@RestController
@RequestMapping("/api/v1.0/market/stock")
public class StockQueryController {

    @Autowired
    private StockService stockService;

    @Operation(summary = "Get All Stocks By Date")
    @ApiResponses(value ={@ApiResponse(responseCode = "200" , description = "OK"),
            @ApiResponse(responseCode = "500" , description = "Bad Request"),
            @ApiResponse(responseCode = "404" , description = "Not Found")})
    @GetMapping("/get/{companyCode}/{startDate}/{endDate}")
    @CrossOrigin("*")
    public ResponseEntity<StockResponse> getAllStocksByDate(@Parameter(description = "Company Code ", example = "code1") @PathVariable String companyCode,
                                                           @Parameter(description = "Start Date ", example = "2014-01-01") @PathVariable Date startDate,
                                                           @Parameter(description = "End Date ", example = "2022-03-03") @PathVariable Date endDate){

       StockResponse stockResponse = stockService.getStocksByDate(companyCode,startDate,endDate);


       return new ResponseEntity<>(stockResponse, HttpStatus.OK);

    }

}
