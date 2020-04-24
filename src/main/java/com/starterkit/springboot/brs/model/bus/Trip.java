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
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int fare;

    private int journeyTime;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private Stop sourceStop;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private Stop destStop;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private Bus bus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Agency agency;

}
