package com.starterkit.springboot.brs.model.bus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;


/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Accessors(chain=true)
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String code;
    private int capacity;
    private String make;
    @ManyToOne
    private Agency agency;
}
