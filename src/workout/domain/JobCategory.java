package az.workout.domain;

import java.io.Serializable;

public class JobCategory implements Serializable {

    private  long id;
    private  String name;

    public JobCategory(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public  JobCategory(){}

    @Override
    public String toString() {
        return "JobCategory{" +
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
