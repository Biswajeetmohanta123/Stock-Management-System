package com.geekster.stockmanagement.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stockId;
    private String stockName;
    private Double stockPrice;
    private Integer stockOwnerCount;
    private String stockType;
    private Double stockMarketCap;
    private LocalDateTime stockBirthTimestamp;
}
