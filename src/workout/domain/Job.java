package az.workout.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Job implements Serializable {
    private  long id;
    private  String position;
    private  String about;
    private  String requirement;
    private BigDecimal salary_min;
    private  BigDecimal salary_max;
    private  Date post_date;
    private Date deadline;
    private  String desciption;
    private  long experience_min;
    private  long experience_max;
    private  User user;
    private Address address;
    private JobCategory jobCategory;
    private  JobType jobType;
    private  Organization organization;
    private  Responsibility responsibility;

    public Job() {
        this.id = 0;
        this.position = "";
        this.about = "";
        this.requirement = "";
        this.salary_min = null;
        this.salary_max = null;
        this.post_date= null;
        this.deadline = null;
        this.desciption="";
        this.experience_min = 0;
        this.experience_max = 0;
        this.user = new User();
        this.organization = null;
        this.address = new Address();
        this.jobCategory =  new JobCategory();
        this.jobType = new JobType();
        this.responsibility=new Responsibility();
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", about='" + about + '\'' +
                ", requirement='" + requirement + '\'' +
                ", salary_min=" + salary_min +
                ", salary_max=" + salary_max +
                ", post_date=" + post_date +
                ", deadline=" + deadline +
                ", desciption='" + desciption + '\'' +
                ", experience_min=" + experience_min +
                ", experience_max=" + experience_max +
                ", user=" + user +
                ", address=" + address +
                ", jobCategory=" + jobCategory +
                ", jobType=" + jobType +
                ", organization=" + organization +
                ", responsibility=" + responsibility +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public BigDecimal getSalary_min() {
        return salary_min;
    }

    public void setSalary_min(BigDecimal salary_min) {
        this.salary_min = salary_min;
    }

    public BigDecimal getSalary_max() {
        return salary_max;
    }

    public void setSalary_max(BigDecimal salary_max) {
        this.salary_max = salary_max;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public long getExperience_min() {
        return experience_min;
    }

    public void setExperience_min(long experience_min) {
        this.experience_min = experience_min;
    }

    public long getExperience_max() {
        return experience_max;
    }

    public void setExperience_max(long experience_max) {
        this.experience_max = experience_max;
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

    public JobCategory getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(JobCategory jobCategory) {
        this.jobCategory = jobCategory;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Responsibility getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(Responsibility responsibility) {
        this.responsibility = responsibility;
    }
}
