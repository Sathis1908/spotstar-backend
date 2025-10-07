package com.example.spotstar.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    private String name;
    private String mailId;
    @Id
    private long phone;
    private String dob;
    private String password;

    public User(String name, String mailId, long phone, String dob, String password) {
        this.name = name;
        this.mailId = mailId;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
    }

    public User() {
    }
}
