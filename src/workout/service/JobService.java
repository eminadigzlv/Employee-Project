package az.workout.service;

import az.workout.domain.Job;
import az.workout.domain.JobCategoryCount;

import java.util.List;

public interface JobService {


    List<JobCategoryCount> getJobCategoryCount();
    List<Job> recentJobs();

    long getJobCount();
    List<Job>  getJobsPage(long page);
      long JobsPageCount();
}
