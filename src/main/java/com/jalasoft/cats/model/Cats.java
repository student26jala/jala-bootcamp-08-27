package com.jalasoft.cats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Cats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDate created_at;
    private String image_url;
    private Boolean favorited;
    private Boolean is_adopted;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Cats_Tags", joinColumns = @JoinColumn(name = "Cat_Id"), inverseJoinColumns = @JoinColumn(name = "Tag_Id"))
    @JsonIgnoreProperties("cats")
    private List<Tags> tags;

}
