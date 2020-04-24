package com.starterkit.springboot.brs.model.bus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Accessors(chain=true)
public class TripSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(unique = true)
    private Trip tripDetail;
    @OneToMany(targetEntity=Ticket.class, fetch=FetchType.EAGER)
    private List<Ticket> ticketsSold;
    private String tripDate;
    private int availableSeats;
}
