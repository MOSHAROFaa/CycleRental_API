package com.cycleRental.cycleRentalCRUD.bean;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// As this is Entity class thus added entity annotation 
@Entity
// With the help of @Table in the DB the CycleRental will be create with 6 columns
@Table(name = "CycleRental")
public class CycleRental {

// id is the primary key thus need this @Id annotation 
  @Id
  private String id;
  private String rentalName;
  private String rentalAddress;
  private double rentalPrice;
  private LocalDate rentalDate;
  private boolean rentalPaid;
  
  
// Default Constructor
  public CycleRental() {

  }

// Parameterized Constructor 
  public CycleRental(String id, String rentalName, String reantalAddress, double rentalPrice, LocalDate rentalDate,
      boolean reantalPaid) {
    super();
    this.id = id;
    this.rentalName = rentalName;
    this.rentalAddress = reantalAddress;
    this.rentalPrice = rentalPrice;
    this.rentalDate = rentalDate;
    this.rentalPaid = reantalPaid;
  }

// Getter and setter methods
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRentalName() {
    return rentalName;
  }

  public void setRentalName(String rentalName) {
    this.rentalName = rentalName;
  }

  public String getRentalAddress() {
    return rentalAddress;
  }

  public void setRentalAddress(String rentalAddress) {
    this.rentalAddress = rentalAddress;
  }

  public double getRentalPrice() {
    return rentalPrice;
  }

  public void setRentalPrice(double rentalPrice) {
    this.rentalPrice = rentalPrice;
  }

  public LocalDate getRentalDate() {
    return rentalDate;
  }

  public void setRentalDate(LocalDate rentalDate) {
    this.rentalDate = rentalDate;
  }

  public boolean isRentalPaid() {
    return rentalPaid;
  }

  public void setRentalPaid(boolean rentalPaid) {
    this.rentalPaid = rentalPaid;
  }

}