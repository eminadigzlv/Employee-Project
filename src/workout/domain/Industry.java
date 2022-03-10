package az.workout.domain;

import java.io.Serializable;

public class Industry implements Serializable {

    private  long id;
    private  String name;

    public Industry() {
        this.id = 0;
        this.name = "";
    }

    @Override
    public String toString() {
        return "Industry{" +
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
