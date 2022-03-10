package az.workout.domain;

public class Responsibility {
    private  long id;
    private  String  descript;
    private  String  descript2;
    private  String  descript3;
    private  String  descript4;

    public Responsibility() {
        this.id = 0;
        this.descript = "";
        this.descript2 = "";
        this.descript3 = "";
        this.descript4 = "";
    }

    @Override
    public String toString() {
        return "Responsibility{" +
                "id=" + id +
                ", descript='" + descript + '\'' +
                ", descript2='" + descript2 + '\'' +
                ", descript3='" + descript3 + '\'' +
                ", descript4='" + descript4 + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDescript2() {
        return descript2;
    }

    public void setDescript2(String descript2) {
        this.descript2 = descript2;
    }

    public String getDescript3() {
        return descript3;
    }

    public void setDescript3(String descript3) {
        this.descript3 = descript3;
    }

    public String getDescript4() {
        return descript4;
    }

    public void setDescript4(String descript4) {
        this.descript4 = descript4;
    }
}
