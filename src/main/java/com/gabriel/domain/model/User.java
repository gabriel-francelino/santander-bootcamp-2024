package com.gabriel.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Features> features;
    private List<News> news;
}
