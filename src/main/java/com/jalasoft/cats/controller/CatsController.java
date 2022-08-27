package com.jalasoft.cats.controller;

import com.jalasoft.cats.dto.CatsDto;
import com.jalasoft.cats.model.Cats;
import com.jalasoft.cats.service.CatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatsController {

    @Autowired
    private CatsService catsService;

    @PostMapping
    public Cats postCat(@RequestBody CatsDto dto){
        return catsService.saveFromDto(dto);
    }

    @GetMapping("/{id}")
    public Cats getACatById(@PathVariable Integer id){
        return catsService.findById(id);
    }

    @GetMapping("/name")
    public List<Cats> listAllByName(){
        return catsService.findAllName();
    }

    @GetMapping("/date")
    public List<Cats> listAllByDate(){
        return catsService.findAllDate();
    }

}
