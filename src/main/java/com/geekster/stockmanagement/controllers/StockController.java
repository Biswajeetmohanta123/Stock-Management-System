package com.geekster.stockmanagement.controllers;

import com.geekster.stockmanagement.models.Stock;
import com.geekster.stockmanagement.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
    @Autowired
    StockService stockService;
    @GetMapping(value = "/type/{stockType}")
    public List<Stock> getStocksBasedOnType(@PathVariable String stockType){
        return stockService.getStockByType(stockType);
    }
    @GetMapping(value = "/abovePrice/price/{price}/lowerDate/date/{date}")
    public List<Stock> getStockAbovePriceAndLowerDate(@PathVariable Double price, @PathVariable String date){
        return stockService.getStockAbovePriceAndLowerDate(price,date);
    }
    @PostMapping(value = "/")
    public String insertStock(@RequestBody List<Stock> stockList){
        return stockService.addStock(stockList);
    }

}
