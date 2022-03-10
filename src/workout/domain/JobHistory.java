package az.workout.domain;

public class JobHistory {
    private  long id;
    private  String idate;
    private String udate;

    public JobHistory() {
        this.id = 0;
        this.idate = "";
        this.udate = "";
    }

    @Override
    public String toString() {
        return "JobHistory{" +
                "id=" + id +
                ", idate='" + idate + '\'' +
                ", udate='" + udate + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdate() {
        return idate;
    }

    public void setIdate(String idate) {
        this.idate = idate;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }
}
