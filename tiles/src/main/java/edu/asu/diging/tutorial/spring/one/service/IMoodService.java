package edu.asu.diging.tutorial.spring.one.service;

import edu.asu.diging.tutorial.spring.one.domain.Mood;

public interface IMoodService {

	public abstract Mood getCurrentMood();

	public abstract String getExplanation();

}