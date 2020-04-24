package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
