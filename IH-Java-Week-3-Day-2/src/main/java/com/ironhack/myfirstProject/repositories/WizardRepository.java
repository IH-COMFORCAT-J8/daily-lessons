package com.ironhack.myfirstProject.repositories;

import com.ironhack.myfirstProject.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}
