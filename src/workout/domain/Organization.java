package az.workout.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Organization implements Serializable {

    private  long id;
    private  String name;
    private  String headOffice;
    private  String createDate;
    private  String about;
    private  long numOfEmployee;
    private  BigDecimal annualRevenue;
    private  long isGlobal;
    private  long rating;
    private  String phone;
    private  String mobile;
    private  String email;
    private  String website;
    private  Industry industry;
    private  Address address;

    public Organization() {
        this.id = 0;
        this.name = "";
        this.headOffice ="";
        this.createDate = "";
        this.about = "";
        this.numOfEmployee = 0;
        this.annualRevenue = null;
        this.isGlobal = 0;
        this.rating = 0;
        this.phone = "";
        this.mobile = "";
        this.email = "";
        this.website = "";
        this.industry = new Industry();
        this.address=new Address();
    }


    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headOffice='" + headOffice + '\'' +
                ", createDate='" + createDate + '\'' +
                ", about='" + about + '\'' +
                ", numOfEmployee=" + numOfEmployee +
                ", annualRevenue=" + annualRevenue +
                ", isGlobal=" + isGlobal +
                ", rating=" + rating +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", industry=" + industry +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public long getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(long numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public long getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(long isGlobal) {
        this.isGlobal = isGlobal;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }
}
