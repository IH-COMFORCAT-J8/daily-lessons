package com.ironhack.netflix.repositories;

import com.ironhack.netflix.models.*;
import org.springframework.data.jpa.repository.*;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
