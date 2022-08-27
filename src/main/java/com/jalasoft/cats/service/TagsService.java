package com.jalasoft.cats.service;

import com.jalasoft.cats.dto.TagsDto;
import com.jalasoft.cats.model.Tags;
import com.jalasoft.cats.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsService {

    @Autowired
    private TagsRepository tagsRepository;

    public Tags saveFromDto(TagsDto dto){
        Tags tags = new Tags();
        tags.setDescription(dto.getDescription());

        return tagsRepository.save(tags);
    }

}
