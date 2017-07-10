package com.mzaradzki.config;


import com.mzaradzki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Marcel on 2017-05-25.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static final int PASSWORD_STRENGTH = 10;

    @Autowired
    private UserService userService;



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

//                .authorizeRequests()
//                .antMatchers("/login").permitAll() //dont need account
//                .antMatchers("/register").permitAll()
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/lenders/**, /lenders-create").hasRole("ADMIN") //block this pages when user with role user type this pages at belt browser
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("api/**").permitAll() //api allow for all
//                .antMatchers("/**").authenticated() //others require logging
//                .and()
                .formLogin()
                    .usernameParameter("email")
                    .passwordParameter("password")
                    .loginPage("/login")
                    .loginProcessingUrl("/login")
                .and()
                    .logout()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/login?logout")
                .and()
                    .csrf()
                    .disable();

    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder(PASSWORD_STRENGTH));


    }
}
