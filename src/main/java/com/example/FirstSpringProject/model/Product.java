package com.example.FirstSpringProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    
}
