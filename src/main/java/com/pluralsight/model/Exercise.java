package com.pluralsight.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.pluralsight.model.Goal;

@Entity
public class Exercise {

	@Id
	@GeneratedValue
	@Column(name="EXER_ID")
	private long id;

	@Range(min = 1, max = 120)
	@Column(name="MINUTES")
	private int minutes;

	@NotNull
	@Column(name="ACTIVITY")
	private String activity;

	@ManyToOne
	private Goal goal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

}
