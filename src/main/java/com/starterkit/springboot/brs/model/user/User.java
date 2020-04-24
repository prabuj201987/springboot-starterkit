package com.starterkit.springboot.brs.model.user;

import com.starterkit.springboot.brs.model.bus.Bus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Accessors(chain=true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    @OneToMany(targetEntity= Role.class, fetch=FetchType.EAGER)
    private Set<Role> roles;
    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}
