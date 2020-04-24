package com.starterkit.springboot.brs.model.bus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Accessors(chain=true)
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String code;

    private String name;

    private String detail;
}
