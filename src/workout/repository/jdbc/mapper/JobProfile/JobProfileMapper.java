package az.workout.repository.jdbc.mapper.JobProfile;

import az.workout.domain.Address;
import az.workout.domain.Job;
import az.workout.domain.JobType;
import az.workout.domain.Organization;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JobProfileMapper implements RowMapper<Job> {
    @Override
    public Job mapRow(ResultSet rs, int i) throws SQLException {
        Job job = new Job();
        job.setId(rs.getLong("job_id"));
        job.setPosition(rs.getString("position"));
        job.setAbout(rs.getString("about"));
        job.setRequirement(rs.getString("requirement"));
        job.setSalary_min(rs.getBigDecimal("salary_min"));
        job.setSalary_max(rs.getBigDecimal("salary_max"));
        job.setPost_date(rs.getDate("post_date"));
        job.setDeadline(rs.getDate("deadline"));
        job.setExperience_min(rs.getLong("experience_min"));
        job.setExperience_max(rs.getLong("experience_max"));
        job.setDesciption(rs.getString("desciption"));
        job.getJobCategory().setId(rs.getLong("job_category_id"));
        job.getJobCategory().setName(rs.getString("job_category_name"));
        if(rs.getLong("organization_id")>0)
        {   job.setOrganization(new Organization());
            job.getOrganization().setId(rs.getLong("organization_id"));
            job.getOrganization().setName(rs.getString("organization_name"));
            job.getOrganization().setHeadOffice(rs.getString("head_office"));
        }
        if(rs.getLong("address_id")>0)
        {
            job.setAddress(new Address());
            job.getAddress().setId(rs.getLong("address_id"));
            job.getAddress().getCountry().setId(rs.getLong("country_id"));
            job.getAddress().getCountry().setName(rs.getString("country_name"));
            job.getAddress().getCity().setId(rs.getLong("city_id"));
            job.getAddress().getCity().setName(rs.getString("city_name"));
            job.getAddress().setInfo(rs.getString("info"));
            job.getAddress().setZipCode(rs.getLong("zipcode"));
        }
        if(rs.getLong("job_type_id")>0)
        {
            job.setJobType(new JobType());
            job.getJobType().setId(rs.getLong("job_type_id"));
            job.getJobType().setName(rs.getString("job_type_name"));
        }
        if(rs.getLong("response_id")>0)
        {
            job.getResponsibility().setId(rs.getLong("response_id"));
            job.getResponsibility().setDescript(rs.getString("descript"));
            job.getResponsibility().setDescript2(rs.getString("descript2"));
            job.getResponsibility().setDescript3(rs.getString("descript3"));
            job.getResponsibility().setDescript4(rs.getString("descript4"));
        }
        return job;
    }
}
