package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
	 

<<<<<<< HEAD
	Passenger findByPassengerUIN(Long uin);
	Passenger findByMobileNumber(Long contact);
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
}
