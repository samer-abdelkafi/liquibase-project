package com.mycompany.todo.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "REF_TODO")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    private String title;

    private String description;

    @Column(name = "TARGET_DATE")
    private LocalDate targetDate;

    @Column(name = "IS_DONE")
    private boolean isDone;

}