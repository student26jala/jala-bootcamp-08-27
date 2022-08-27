package com.jalasoft.cats.service;

import com.jalasoft.cats.dto.CatsDto;
import com.jalasoft.cats.model.Cats;
import com.jalasoft.cats.repository.CatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatsService {

    @Autowired
    private CatsRepository catsRepository;

    public Cats saveFromDto(CatsDto dto){
        Cats cats = new Cats();
        cats.setName(dto.getName());
        cats.setCreated_at(dto.getCreated_at());
        cats.setImage_url(dto.getImage_url());
        cats.setFavorited(dto.getFavorited());
        cats.setIs_adopted(dto.getIs_adopted());
        cats.setTags(dto.getTags());

        return catsRepository.save(cats);
    }

    public Cats findById(Integer id){
        return catsRepository.findById(id).get();
    }

    public List<Cats> findAll(){
        return catsRepository.findAll();
    }

    public List<Cats> findAllName(){
        return catsRepository.findAllOrderByName();
    }

    public List<Cats> findAllDate(){
        return catsRepository.findAllOrderByDate();
    }

}
