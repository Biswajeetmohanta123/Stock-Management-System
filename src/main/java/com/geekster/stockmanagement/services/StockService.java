package com.geekster.stockmanagement.services;

import com.geekster.stockmanagement.models.Stock;
import com.geekster.stockmanagement.repositories.IStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {
    @Autowired
    IStockRepository stockRepo;

    public List<Stock> getStockByType(String stockType) {
        return stockRepo.findByStockType(stockType);
    }

    public String addStock(List<Stock> stockList) {
        Iterable<Stock> list = stockRepo.saveAll(stockList);
        if(list != null){
            return "Stocks Added Successfully ...!!";
        }
        return "Stocks Not Added.!!!";
    }

    public List<Stock> getStockAbovePriceAndLowerDate(Double price, String date) {
        LocalDateTime myDate = LocalDateTime.parse(date);
        return stockRepo.findByStockPriceGreaterThanAndStockBirthTimestampLessThan(price,myDate);
    }
}
