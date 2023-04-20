package com.example.FirstSpringProject.model;

import lombok.*;
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
    private List<Product> products;
    public void setCost(List<Product> products){
        BigDecimal sum = new BigDecimal("0");
        for (Product p:products) {
            sum = sum.add(p.getCost());
        }
        this.cost = sum;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Order;
    }

}
