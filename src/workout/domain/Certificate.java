package az.workout.domain;

import java.io.Serializable;

public class Certificate  implements Serializable
{
    private long id;
    private String title;
    private String agency;
    private String certificateDate;
    private String file;

    public Certificate() {
        this.id = 0;
        this.title = "";
        this.agency = "";
        this.certificateDate = "";
        this.file = "";
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", agency='" + agency + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                ", file='" + file + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
