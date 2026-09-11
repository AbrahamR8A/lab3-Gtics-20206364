package com.pucp.lab3.entity;

import jakarta.persistence.*;

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String job_id;

    private String job_title;

    private Double min_salary;

    private Double max_salary;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Double min_salary) {
        this.min_salary = min_salary;
    }

    public Double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Double max_salary) {
        this.max_salary = max_salary;
    }
}
