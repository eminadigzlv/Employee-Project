package az.workout.repository.jdbc.mapper;

import az.workout.domain.Address;
import az.workout.domain.Job;
import az.workout.domain.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JobMapper implements RowMapper<Job> {

   @Override
   public Job mapRow(ResultSet rs, int i) throws SQLException {
      Job job= new Job();
      job.setId(rs.getLong("job_id"));
      job.setAbout(rs.getString("about"));
      job.setRequirement(rs.getString("requirement"));
      job.setPosition(rs.getString("position"));
      job.setSalary_min(rs.getBigDecimal("salary_min"));
      job.setSalary_max(rs.getBigDecimal("salary_max"));
      job.setPost_date(rs.getDate("post_date"));
      job.setDeadline(rs.getDate("deadline"));
      job.setExperience_min(rs.getLong("experience_min"));
      job.setExperience_max(rs.getLong("experience_max"));
      if(rs.getLong("user_id")>0) {
         job.setUser(new User());
         job.getUser().setId(rs.getLong("user_id"));
         job.getUser().setName(rs.getString("user_name"));
         job.getUser().setSurname(rs.getString("surname"));
         job.getUser().setEmail(rs.getString("user_email"));
         job.getUser().setMobile(rs.getString("user_mobile"));
      }
      job.getJobType().setId(rs.getLong("job_type_id"));
      job.getJobType().setName(rs.getString("job_type_name"));
      job.getAddress().setId(rs.getLong("address_id"));
      job.getAddress().getCountry().setId(rs.getLong("country_id"));
      job.getAddress().getCountry().setName(rs.getString("country_name"));
      job.getAddress().getCity().setId(rs.getLong("city_id"));
      job.getAddress().getCity().setName(rs.getString("city_name"));
      job.getAddress().setInfo(rs.getString("info"));
      job.getJobCategory().setId(rs.getLong("job_category_id"));
      job.getJobCategory().setName(rs.getString("job_category_name"));
      if(rs.getLong("address_id")>0)
      {
        job.setAddress(new Address());
        job.getAddress().setId(rs.getLong("address_id"));
        job.getAddress().setInfo(rs.getString("info"));
        job.getAddress().getCountry().setId(rs.getLong("country_id"));
        job.getAddress().getCountry().setName(rs.getString("country_name"));
        job.getAddress().getCity().setId(rs.getLong("city_id"));
        job.getAddress().getCity().setName(rs.getString("city_name"));
      }

      return  job;
   }
}

