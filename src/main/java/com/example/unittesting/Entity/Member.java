package com.example.unittesting.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
 
    @Id
    double id;
    
    String name;
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }
    public Member() {
    }
    public Member(double id, String name) {
        this.id = id;
        this.name = name;
    }



    
}
