package by.poland.pionwit.db.publlic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countrys")
public class Country {
    @Id
    private Integer id;
    private Integer namber;
    private String simvol;
    private String title;

    public Country() {
    }

    public Country(Integer id, Integer namber, String simvol, String title) {
        this.id = id;
        this.namber = namber;
        this.simvol = simvol;
        this.title = title;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNamber() {
        return namber;
    }

    public void setNamber(Integer namber) {
        this.namber = namber;
    }

    public String getSimvol() {
        return simvol;
    }

    public void setSimvol(String simvol) {
        this.simvol = simvol;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
