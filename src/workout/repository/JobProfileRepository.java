package az.workout.repository;

import az.workout.domain.Job;

import java.util.List;

public interface JobProfileRepository {

    List<Job> getJobProfile(long id);
}
