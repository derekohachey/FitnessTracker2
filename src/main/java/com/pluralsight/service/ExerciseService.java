package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import org.springframework.web.bind.annotation.ExceptionHandler;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}