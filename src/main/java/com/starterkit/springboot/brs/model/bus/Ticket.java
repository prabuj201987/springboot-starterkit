package com.starterkit.springboot.brs.model.bus;

import com.starterkit.springboot.brs.model.user.User;
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
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int seatNumber;
    private boolean cancellable;
    private String journeyDate;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private TripSchedule tripSchedule;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private User passenger;
}
