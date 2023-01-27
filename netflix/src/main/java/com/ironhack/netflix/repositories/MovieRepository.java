package com.ironhack.netflix.repositories;

import com.ironhack.netflix.models.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
