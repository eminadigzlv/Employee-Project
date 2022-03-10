package az.workout.domain;

import java.io.Serializable;

public class EducationLevel implements Serializable {
    private  long id;
    private  String name;
    private  String about;

    public EducationLevel() {
        this.id = 0;
        this.name = "";
        this.about="";
    }

    @Override
    public String toString() {
        return "EducationLevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
