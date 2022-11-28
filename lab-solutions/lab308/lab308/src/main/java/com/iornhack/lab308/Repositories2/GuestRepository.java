package com.iornhack.lab308.Repositories2;

import com.iornhack.lab308.Models2.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
