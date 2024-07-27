package com.gabriel.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Card {
    private String number;
    private BigDecimal limit;
}
