package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface ShowsDAO {
	
	public Shows findShows(int userId);
	
	public List<Shows> findAll();
	public void saveShows(Shows shows);

}
