package by.poland.pionwit.db.user;


public class Statuses  implements java.io.Serializable {


    private Integer id;
    private String name;
    private String opis;

    public Statuses() {
    }

    public Statuses(String name, String opis) {
        this.name = name;
        this.opis = opis;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}


