package com.example.demo1.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trainers")
public class Trainer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    @Column(name = "subject")
    private String subject;


    public Trainer() {
    }

    public Trainer(int id, String fName, String lName, String subject) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }

    public Trainer(String fName, String lName, String subject) {
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}