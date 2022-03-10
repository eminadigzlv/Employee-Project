package az.workout.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Candidate implements Serializable {
    private long id;
    private String birthdate;
    private String position;
    private BigDecimal salaryMin;
    private  BigDecimal salaryMax;
    private  User user;
    private Address address;
    private EducationLevel educationLevel;
    private  JobHistory jobHistory;
    private  Certificate certificate;
    private  Language language;

    public Candidate() {
        this.id = 0;
        this.birthdate = "";
        this.position = "";
        this.salaryMin = null;
        this.salaryMax = null;
        this.user = new User();
        this.address = new Address();
        this.educationLevel = new EducationLevel();
        this.jobHistory = new JobHistory();
        this.certificate = new Certificate();
        this.language = new Language();
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", birthdate='" + birthdate + '\'' +
                ", position='" + position + '\'' +
                ", salaryMin=" + salaryMin +
                ", salaryMax=" + salaryMax +
                ", user=" + user +
                ", address=" + address +
                ", educationLevel=" + educationLevel +
                ", jobHistory=" + jobHistory +
                ", certificate=" + certificate +
                ", language=" + language +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(BigDecimal salaryMin) {
        this.salaryMin = salaryMin;
    }

    public BigDecimal getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(BigDecimal salaryMax) {
        this.salaryMax = salaryMax;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public JobHistory getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(JobHistory jobHistory) {
        this.jobHistory = jobHistory;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
