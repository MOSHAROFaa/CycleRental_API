package com.cycleRental.cycleRentalCRUD.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cycleRental.cycleRentalCRUD.bean.CycleRental;
import com.cycleRental.cycleRentalCRUD.repository.CycleRentalRepository;


@Service
public class CycleRentalService {

	@Autowired
	public CycleRentalRepository cycleRentalRepo;
	public List<CycleRental> getAllCycleRental(){
		List<CycleRental> cycleRental = new ArrayList<>();
		cycleRentalRepo.findAll().forEach(cycleRental::add);
		return cycleRental;
	}
	
	
	// This is to GET only 1 Rental 
	public Object GetId(String id, CycleRental cycleRental) {
		return cycleRental;
	}
	
	public CycleRental getCycleRental(String id) {
	    return cycleRentalRepo.findById(id).orElse(null);
	}
	
	// This is for POST
	public void addCycleRental(CycleRental cycleRental) {
		// TODO Auto-generated method stub
		cycleRentalRepo.save(cycleRental);
	}
	
	
	// This is for PUT
	public void updateCycleRental(String id, CycleRental cycleRental) {
		// TODO Auto-generated method stub
		cycleRentalRepo.save(cycleRental);
	}

	
//	public void updateCycleRental(String id, CycleRental cycleRental) {
//		// TODO Auto-generated method stub
//		if(cycleRentalRepo.existsById(cycleRental.getId())) {
//			cycleRentalRepo.save(cycleRental);
//		}
//		else {
//			 throw new IllegalArgumentException("Cycle rental with ID " + cycleRental.getId() + " not found");
//		}
//	}
	
	
	// This is for DELETE
	public void deleteCycleRental(String id) {
		// TODO Auto-generated method stub
		cycleRentalRepo.deleteById(id);
	}
	
	
	
	
	
}
