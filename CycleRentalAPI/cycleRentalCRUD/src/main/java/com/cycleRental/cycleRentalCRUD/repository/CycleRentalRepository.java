package com.cycleRental.cycleRentalCRUD.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cycleRental.cycleRentalCRUD.bean.CycleRental;

@Repository
public interface CycleRentalRepository  extends CrudRepository<CycleRental, String>{

}
