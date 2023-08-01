package com.geekster.stockmanagement.repositories;

import com.geekster.stockmanagement.models.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IStockRepository extends CrudRepository<Stock,Integer> {

    List<Stock> findByStockType(String stockType);

    List<Stock> findByStockPriceGreaterThanAndStockBirthTimestampLessThan(Double price, LocalDateTime myDate);
}
