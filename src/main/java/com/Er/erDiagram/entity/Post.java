package com.Er.erDiagram.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "posts ")
public class Post {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, length = 5000)
    private String description;


    @OneToMany(mappedBy = "post",cascade =CascadeType.ALL,orphanRemoval = true)
    private Set<Comment> posts ;

}