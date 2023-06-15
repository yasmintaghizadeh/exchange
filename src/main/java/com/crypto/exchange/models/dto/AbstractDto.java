package com.crypto.exchange.models.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public abstract class AbstractDto {
    private String id;
    private Data lastModifiedDate;
    private Data createdDate;
    private Integer version;

}
