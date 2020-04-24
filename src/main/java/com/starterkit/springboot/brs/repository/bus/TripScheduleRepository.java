package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Trip;
import com.starterkit.springboot.brs.model.bus.TripSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface TripScheduleRepository extends JpaRepository<TripSchedule, Integer> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}