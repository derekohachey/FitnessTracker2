package com.pluralsight.controller;

import com.pluralsight.model.Goal;
import com.pluralsight.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Derek on 2016-11-13.
 */

@RestController
public class GoalRestController {

    @Autowired
    private GoalService goalService;

    @RequestMapping(value = "/getRestGoal", method = RequestMethod.GET)
    public ResponseEntity<List<Goal>> getGoalsRest() {
        System.out.println("is it reaching here?");
        return new ResponseEntity<List<Goal>>(getGoalService().findAllGoals(), HttpStatus.OK);
    }

    public GoalService getGoalService() {
        return goalService;
    }

    public void setGoalService(GoalService goalService) {
        this.goalService = goalService;
    }

}
