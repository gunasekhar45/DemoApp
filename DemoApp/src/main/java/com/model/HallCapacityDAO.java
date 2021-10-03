package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface HallCapacityDAO {
	
	public HallCapacity findHallCapacity(int userId);
	
	public List<HallCapacity> findAll();
	public void saveHallCapacity(HallCapacity hallcapacity);

}
