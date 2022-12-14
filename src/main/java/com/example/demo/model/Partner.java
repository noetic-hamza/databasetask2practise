package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="partner")
public class Partner {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }


    @Column(name = "name")
    private String name;

    @Column(name ="email")
    private String email;
    Partner(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Partner(String name, String email) {

        this.name = name ;
        this.email = email;

    }

}
