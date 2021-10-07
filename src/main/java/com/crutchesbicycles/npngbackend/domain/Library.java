package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Library extends BaseEntity {

    @Column
    private String caption;

    @Column
    private String address;

    // TODO: 06.10.2021 спросить у Сереги почему не boolean
    @Column
    private Integer isERT;
}
