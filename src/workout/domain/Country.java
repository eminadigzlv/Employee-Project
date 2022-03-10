package az.workout.domain;


import java.io.Serializable;


public class Country implements Serializable {
    private long id;
    private String name;

    public Country(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
