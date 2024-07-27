package com.gabriel.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;
}
