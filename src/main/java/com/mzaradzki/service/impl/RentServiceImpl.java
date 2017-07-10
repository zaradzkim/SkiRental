package com.mzaradzki.service.impl;

import com.mzaradzki.dao.RentDAO;
import com.mzaradzki.dao.SkisDAO;
import com.mzaradzki.model.Rent;
import com.mzaradzki.model.Skis;
import com.mzaradzki.model.User;
import com.mzaradzki.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Marcel on 2017-06-08.
 */
@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentDAO rentDAO;

    @Autowired
    private SkisDAO skisDAO;

    @Override
    @Transactional
    public void createRent(User user, Skis skis) {
        Rent rent = new Rent(user, skis);

        rentDAO.save(rent);
        skisDAO.save(skis);

    }
}
