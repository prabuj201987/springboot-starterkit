package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Agency;
import com.starterkit.springboot.brs.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface AgencyRepository extends JpaRepository<Agency, Integer> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
