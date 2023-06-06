package com.mirian.StudentManagmentApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "principal")
public class Principal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_principal")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @OneToOne
    @JoinColumn
    private School idSchool;

    public Principal(String firstName, String lastName, String email, School idSchool) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.idSchool = idSchool;
    }

    public Principal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public School getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(School idSchool) {
        this.idSchool = idSchool;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", idSchool=" + idSchool +
                '}';
    }
}
