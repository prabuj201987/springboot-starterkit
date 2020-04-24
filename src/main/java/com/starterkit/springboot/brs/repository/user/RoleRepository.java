package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);

}
