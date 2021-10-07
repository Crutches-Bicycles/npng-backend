package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class UserBookList extends BaseEntity {

    @OneToOne
    private User user;

    @ManyToOne
    private Book book;

    @ManyToOne
    private BookState bookState;

    @Column
    private LocalDateTime added;
}
