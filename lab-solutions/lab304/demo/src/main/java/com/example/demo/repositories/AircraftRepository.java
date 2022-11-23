package com.example.demo.repositories;

import com.example.demo.models.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, String> {

    List<Aircraft> findByModelContaining(String model);
}
