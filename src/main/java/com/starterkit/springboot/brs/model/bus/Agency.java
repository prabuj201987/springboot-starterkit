package com.starterkit.springboot.brs.model.bus;

import com.starterkit.springboot.brs.model.user.User;
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
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String code;
    private String name;
    private String details;
    @OneToOne
    private User owner;
    @OneToMany(targetEntity=Bus.class, cascade = CascadeType.ALL)
    @JoinColumn(name="id", referencedColumnName = "id")
    private Set<Bus> buses;
}
