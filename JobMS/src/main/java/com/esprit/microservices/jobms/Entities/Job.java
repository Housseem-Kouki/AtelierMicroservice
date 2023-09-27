package com.esprit.microservices.jobms.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Job implements Serializable {


    @Id
    @GeneratedValue
    private int id;
    private String service;
    private Boolean Etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Boolean getEtat() {
        return Etat;
    }

    public void setEtat(Boolean etat) {
        Etat = etat;
    }



    public Job(String service, Boolean etat) {
        super();
        this.service = service;
        Etat = etat;
    }

    public Job() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Job(String service) {
        super();
        this.service = service;
    }

}