package az.workout.repository.jdbc;

import az.workout.domain.Job;
import az.workout.repository.JobProfileRepository;
import az.workout.repository.jdbc.mapper.JobProfile.JobProfileMapper;
import az.workout.repository.jdbc.query.JobProfileQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobProfileRepositoryJdbc implements JobProfileRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private JobProfileMapper jobProfileMapper;

    @Override
    public List<Job> getJobProfile(long id) {
        String sql= JobProfileQuery.GET_JOB_PROFILE.replace("{OFFSET}",String.valueOf(id));
        return jdbcTemplate.query(sql,new MapSqlParameterSource(), jobProfileMapper);
    }
}
