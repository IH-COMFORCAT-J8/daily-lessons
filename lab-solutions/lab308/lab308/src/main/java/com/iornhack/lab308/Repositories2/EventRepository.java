package com.iornhack.lab308.Repositories2;

import com.iornhack.lab308.Models2.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
