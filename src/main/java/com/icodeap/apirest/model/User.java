package com.icodeap.apirest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String dni;
    private Long promocion;

    public Long getId() {
        return id;
    }

     public void setPromocion(Long promocion){
        this.promocion = promocion;
    }

    public Long getPromocion(){
    return promocion;
    }
    public void setId(Long id) {
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

    public String getDni() {
        return dni;
    }

   

    public void setDni(String dni) {
        this.dni = dni;
    }
}
