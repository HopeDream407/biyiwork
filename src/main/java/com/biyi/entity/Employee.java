package com.biyi.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Table(name = "employees")
@Entity
public class Employee extends AbstractPersistable {
    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "tel")
    private Long tel;

    @Column(name = "email")
    private String email;

    @Lob
    @Column(name = "jurisdiction")
    private String jurisdiction;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}