package az.workout.domain;

import java.io.Serializable;

public class JobCategoryCount implements Serializable {

    Serializable serializable="12345678912345";

    private  Long id;
    private  String name;
    private int count;
    private  String icon;

    public JobCategoryCount(Long id, String name, int count, String icon) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "JobCategoryCount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", icon='" + icon + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
