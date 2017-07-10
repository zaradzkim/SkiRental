package com.mzaradzki.service;

import com.mzaradzki.model.Skis;
import com.mzaradzki.model.User;

/**
 * Created by Marcel on 2017-06-08.
 */
public interface RentService {

    void createRent(User user, Skis skis);
}
