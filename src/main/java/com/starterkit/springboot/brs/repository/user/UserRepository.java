package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

}
