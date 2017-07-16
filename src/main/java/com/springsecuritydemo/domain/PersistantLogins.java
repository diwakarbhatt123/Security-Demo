package com.springsecuritydemo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by diwakar on 16/07/17.
 */
@Entity
@Table(name = "persistent_logins")
public class PersistantLogins {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String series;
    private String token;
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_used;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLast_used() {
        return last_used;
    }

    public void setLast_used(Date last_used) {
        this.last_used = last_used;
    }

    @Override
    public String toString() {
        return "PersistantLogins{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", series='" + series + '\'' +
                ", token='" + token + '\'' +
                ", last_used=" + last_used +
                '}';
    }
}
