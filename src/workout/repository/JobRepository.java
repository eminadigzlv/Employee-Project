package az.workout.repository;


import az.workout.domain.Job;
import az.workout.domain.JobCategoryCount;

import java.util.List;

public interface JobRepository {


    List<JobCategoryCount>  getJobCategoryCount();
    List<Job> recentJobs();


    long getJobCount();
    List<Job>  getJobsPage(long offset, long page);

}
