package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserLog extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    private User user;

    @Column
    private String description;

    @OneToOne
    @JoinColumn(name = "idUserAction", referencedColumnName = "id")
    private UserAction userAction;
}
