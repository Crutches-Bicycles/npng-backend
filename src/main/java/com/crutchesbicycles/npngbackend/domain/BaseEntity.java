package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "id", nullable = false)
    private Long id;
}
