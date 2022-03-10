package az.workout.repository.jdbc;

import az.workout.domain.Job;
import az.workout.domain.JobCategoryCount;
import az.workout.repository.jdbc.mapper.JobMapper;
import az.workout.repository.JobRepository;
import az.workout.repository.jdbc.query.SqlQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static az.workout.repository.jdbc.query.SqlQuery.*;

@Repository
public class JobRepositoryJdbc implements JobRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<JobCategoryCount> getJobCategoryCount() {
        return jdbcTemplate.query(GET_CATEGORY_COUNT, new MapSqlParameterSource(),
                (rs, i) -> new JobCategoryCount(rs.getLong("id"),
                        rs.getString("name"), rs.getInt("job_count"),
                        rs.getString("icon_class")));
    }
    @Override
    public List<Job> recentJobs() {
        return jdbcTemplate.query(GET_RECENT_JOB, new MapSqlParameterSource(),jobMapper);
    }

    @Override
    public long getJobCount() {
        return jdbcTemplate.queryForObject(GET_ALL_JOB_COUNT, new MapSqlParameterSource(), Long.class);
    }

    @Override
    public List<Job> getJobsPage(long offset, long page) {
        String sqlQuery = SqlQuery.GET_JOBS_LIST_WITH_PAGING.replace("{Offset}",String.valueOf(offset));
        return jdbcTemplate.query(sqlQuery, new MapSqlParameterSource(), jobMapper);
    }
}
