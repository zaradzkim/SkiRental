package com.mzaradzki.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Marcel on 2017-06-08.
 */

@Entity
@Table(name = "rents")
public class Rent extends BaseEntity {

    public enum Status {
        IN_PROGRESS, FINISHED
    }


    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ski_id", nullable = false)
    private Skis skis;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Rent(){

    }

    public Rent(User user, Skis skis) {
        this.createdDate = new Date();
        this.user = user;
        this.skis = skis;
        this.status = Status.IN_PROGRESS;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skis getSkis() {
        return skis;
    }

    public void setSkis(Skis skis) {
        this.skis = skis;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

