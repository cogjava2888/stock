package com.emarket.stock.controller;

import com.emarket.stock.services.StockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/market/stock")
public class StockCommandController {

    @Autowired
    private StockService stockService;


    @Operation(summary = "Add stocks to provided company")
    @ApiResponses(value ={@ApiResponse(responseCode = "200" , description = "OK"),
            @ApiResponse(responseCode = "500" , description = "Bad Request"),
            @ApiResponse(responseCode = "404" , description = "Not Found")})
    @PostMapping("/add/{companyCode}")
    @CrossOrigin("*")
    public String addStock(@PathVariable @Parameter(description = "Company Code ", example = "code1")String companyCode,
                          @RequestBody @Parameter(description = "Stock Price ", example = "100.00") Double stockPrice){

        int stocSaved = stockService.addStocks(companyCode,stockPrice);

        if(stocSaved  > 0 )
            return "Stock Added Successfully";

        else
            return "Stock cannot be added . Please try again after sometime!!!!";
    }
}
