package com.mzaradzki.dao;

import com.mzaradzki.model.Rent;
import com.mzaradzki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marcel on 2017-06-08.
 */
@Repository
public interface RentDAO extends JpaRepository<Rent, Integer> {

    List<Rent> findByUserOrderByCreatedDateDesc(User user);
}
