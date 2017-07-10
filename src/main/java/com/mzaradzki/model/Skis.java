package com.mzaradzki.model;

import javax.persistence.*;

/**
 * Created by Marcel on 2017-05-19.
 */
@Entity
@Table(name = "skis")
public class Skis {

    @Id
    @Column(name= "skisId")
    @GeneratedValue
    private Integer skisId;

    @Column(name = "company", length = 20)
    private String company;

    @Column(name = "model", length = 20)
    private String model;

    @Column(name = "description", length = 200)
    private String description;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] photo;

    public Skis(String company, String model, String description, byte[] photo, Integer skisId) {
        this.company = company;
        this.model = model;
        this.description = description;
        this.photo = photo;
        this.skisId = skisId;


    }

    public Skis() {

    }

    public Integer getSkisId() {
        return skisId;
    }

    public void setSkisId(Integer skisId) {
        this.skisId = skisId;
    }

    public String getCompany() {
       return company;
   }
 public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}


