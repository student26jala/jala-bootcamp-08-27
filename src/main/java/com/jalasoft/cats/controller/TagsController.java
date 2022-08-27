package com.jalasoft.cats.controller;

import com.jalasoft.cats.dto.TagsDto;
import com.jalasoft.cats.model.Tags;
import com.jalasoft.cats.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @PostMapping
    public Tags postTag(@RequestBody TagsDto dto){
        return tagsService.saveFromDto(dto);
    }

}
