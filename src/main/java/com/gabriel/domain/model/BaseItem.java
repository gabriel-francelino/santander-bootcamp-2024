package com.gabriel.domain.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseItem {
    private String icon;
    private String description;
}
