package com.jalasoft.cats.dto;

import com.jalasoft.cats.model.Tags;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CatsDto {

    private Integer id;
    private String name;
    private LocalDate created_at;
    private String image_url;
    private Boolean favorited;
    private Boolean is_adopted;
    private List<Tags> tags;

}
