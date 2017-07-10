package com.rentsystem.test;

import com.mzaradzki.dao.UserDAO;
import com.mzaradzki.model.User;
import com.rentsystem.init.TestConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static io.restassured.module.mockmvc.RestAssuredMockMvc.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


/**
 * Created by Marcel on 2017-06-09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes= TestConfig.class)
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

//    @Autowired
//    private UserDAO userDAO;

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testHomePage() throws Exception {
        mvc.perform(get("/add/skis"))
                .andExpect(status().isOk())
                .andExpect(view().name("add-skis"));
    }


}

//    @Test
//    public void testRent() throws Exception {
//        mvc.perform(get("/rent/ski/{skiId}"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("rent-message"));
//    }
//}





//    @Test
//    public void AddUser() throws Exception {
//
//        String email = "zaradzkim@gmail.com";
//        mvc.perform(post("/register")
//                .param("id", Integer.toString(1))
//                .param("firstName", "Marcel")
//                .param("lastName", "Zaradzki")
//                .param("email", email)
//                .param("password", "1234"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/login"));
//
//        User u = userDAO.findByEmail(email);
//        Assert.assertTrue(u != null);
//
//    }
//}



