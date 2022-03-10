package az.workout.service.impl;

import az.workout.domain.Job;
import az.workout.repository.JobProfileRepository;
import az.workout.service.JobProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobProfileServiceIml implements JobProfileService {

    @Autowired
    JobProfileRepository jobProfileRepository;
    @Override
    public List<Job> getJobProfile(long id) {
        if(id<0)
        {
            id*=(-1);
        }
        return  jobProfileRepository.getJobProfile(id);
    }
}
