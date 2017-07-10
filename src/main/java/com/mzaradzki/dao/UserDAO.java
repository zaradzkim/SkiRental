package com.mzaradzki.dao;


import com.mzaradzki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marcel on 2017-05-25.
 */
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
