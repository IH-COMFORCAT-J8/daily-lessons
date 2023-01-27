package com.ironhack.IHJavaWeek4Day1.repositories;

import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByDepartment(Department department);
    List<Product> findByCategory(Category category);
    List<Product> findByCategoryAndDepartment(Category  category, Department department);
}
