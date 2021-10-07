package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class LibraryBook extends BaseEntity {
    @ManyToOne
    private Library library;

    @ManyToOne
    private Book book;

    @Column
    private Integer count;
}
