package com.jalasoft.cats.repository;

import com.jalasoft.cats.model.Cats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatsRepository extends JpaRepository<Cats, Integer> {

    @Query("select c from Cats c order by c.name asc")
    List<Cats> findAllOrderByName();

    @Query("select c from Cats c order by c.created_at desc")
    List<Cats> findAllOrderByDate();

}
