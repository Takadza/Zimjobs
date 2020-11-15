package com.greencoder.zimjobs.domain;

import javax.persistence.*;

@Entity
public class Vacancy {

    private Long id;
    private String vacantTitle;
    private String category;
    private String date;
    private double salary;
    private String vacantDetails;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVacantTitle() {
        return vacantTitle;
    }

    public void setVacantTitle(String vacantTitle) {
        this.vacantTitle = vacantTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getVacantDetails() {
        return vacantDetails;
    }

    public void setVacantDetails(String vacantDetails) {
        this.vacantDetails = vacantDetails;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
