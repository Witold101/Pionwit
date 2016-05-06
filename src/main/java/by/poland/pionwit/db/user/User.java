package by.poland.pionwit.db.user;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date date_reg;
    private Date date_last;

    @ManyToOne
    @JoinColumn (name = "status")
    private Statuses statuses;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Date date_reg, Date date_last, Statuses statuses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.date_reg = date_reg;
        this.date_last = date_last;
//        this.statusId= statuses.getId();
        this.statuses = statuses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public Date getDate_last() {
        return date_last;
    }

    public void setDate_last(Date date_last) {
        this.date_last = date_last;
    }

    public Statuses getStatuses() {
        return statuses;
    }

    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
    }
}
