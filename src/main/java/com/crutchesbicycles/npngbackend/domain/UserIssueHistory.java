package com.crutchesbicycles.npngbackend.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class UserIssueHistory extends BaseEntity {

    @ManyToOne
    private User user;

    @OneToMany
    @JoinColumn(name = "idBook", referencedColumnName = "id")
    private Set<Book> books;

    @OneToMany
    @JoinColumn(name = "idLibraries", referencedColumnName = "id")
    private Set<Library> libraries;

    private LocalDate issueDate;
}
