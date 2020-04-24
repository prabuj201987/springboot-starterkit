package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Agency;
import com.starterkit.springboot.brs.model.bus.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface BusRepository extends JpaRepository<Bus, Integer> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
