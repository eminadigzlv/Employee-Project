package az.workout.service;

import az.workout.domain.Job;

import java.util.List;

public interface JobProfileService {

    List<Job> getJobProfile(long id);
}
