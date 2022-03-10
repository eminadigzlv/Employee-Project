package az.workout.service.impl;


import az.workout.domain.Job;
import az.workout.domain.JobCategoryCount;
import az.workout.repository.JobRepository;
import az.workout.repository.jdbc.JobRepositoryJdbc;
import az.workout.service.JobService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    final
    JobRepository jobRepositoryJdbc;

    @Value("${job.page.size}")
    private long pageSize;

    public JobServiceImpl(JobRepositoryJdbc jobRepositoryJdbc) {
        this.jobRepositoryJdbc = jobRepositoryJdbc;
    }

    @Override
    public List<JobCategoryCount> getJobCategoryCount() {
        return jobRepositoryJdbc.getJobCategoryCount();
    }

    @Override
    public List<Job> recentJobs() {
        return jobRepositoryJdbc.recentJobs();
    }


    @Override
    public long getJobCount() {
        return jobRepositoryJdbc.getJobCount();
    }

    @Override
    public List<Job> getJobsPage(long page) {
        if(page<0)
        {
            page=1;
        }
        long offset;
        offset=((page-1)*pageSize);

        return jobRepositoryJdbc.getJobsPage(offset,page);
    }
    public  long JobsPageCount()
    {   long jobsCount= jobRepositoryJdbc.getJobCount();
        long pageCount= (jobsCount/pageSize);
        if (jobsCount%pageSize!=0)
        {
            pageCount++;
        }
        return  pageCount;

    }
}
