package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface StopRepository extends JpaRepository<Stop, Integer> {
    Stop findByCode(String code);
}
