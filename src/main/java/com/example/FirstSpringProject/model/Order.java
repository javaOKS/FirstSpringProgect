package com.example.FirstSpringProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
public class Order {
    private int id;
    private LocalDateTime date;
    private BigDecimal cost;

}
