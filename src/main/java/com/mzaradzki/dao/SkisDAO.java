package com.mzaradzki.dao;


import com.mzaradzki.model.Skis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by Marcel on 2017-05-19.
 */
@Repository
public interface SkisDAO extends CrudRepository<Skis, Integer> {

   @Query("select s from Skis s where s.skisId = :skisId")
    Skis findBySkisId(@Param("skisId") Integer skisId);



}
