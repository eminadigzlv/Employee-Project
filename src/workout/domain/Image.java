package az.workout.domain;

import java.io.Serializable;

public class Image implements Serializable {

    private long id;
    private  Object picture;

    public Image() {
        this.id = id;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", picture=" + picture +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }
}
