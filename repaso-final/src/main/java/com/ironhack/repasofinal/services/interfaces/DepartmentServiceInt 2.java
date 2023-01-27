package com.ironhack.repasofinal.services.interfaces;

import com.ironhack.repasofinal.models.*;

import java.util.*;

public interface DepartmentServiceInt {
    List<Product> findByDepartmentId(Optional<Long> id);
}
