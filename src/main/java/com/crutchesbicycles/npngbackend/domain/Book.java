package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Book extends BaseEntity {

    @Column
    private String caption;

    @Column
    private String author;

    @Column
    private Integer year;
}
