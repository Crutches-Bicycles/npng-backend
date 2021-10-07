package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class UserAction extends BaseEntity {

    @Column
    private String caption;
}
