package com.springsecuritydemo.domain;

import sun.plugin.util.UserProfile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by diwakar on 15/07/17.
 */
@Entity
public class User {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String userId;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    @ManyToMany
    @JoinTable(name = "User_Roles",
            joinColumns = { @JoinColumn(name = "User_Id") },
            inverseJoinColumns = { @JoinColumn(name = "Role_Id") })
    private Set<Role> userRoles = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<Role> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<Role> userRoles) {
        this.userRoles = userRoles;
    }
}
