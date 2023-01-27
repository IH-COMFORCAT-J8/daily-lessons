package com.ironhack.repasofinal;

import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepasoFinalApplication implements CommandLineRunner {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProductRepository productRepository;


    public static void main(String[] args) {

        SpringApplication.run(RepasoFinalApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Department dep1 = departmentRepository.save(new Department("tools"));
        Department dep2 = departmentRepository.save(new Department("edible plants"));
        Department dep3 = departmentRepository.save(new Department("non-edible plants"));
        Department dep4 = departmentRepository.save(new Department("edible seeds"));
        Department dep5 = departmentRepository.save(new Department("non-edible seeds"));
        Department dep6 = departmentRepository.save(new Department("miscellaneous"));

        Product pr1 = productRepository.save(new Product("small shovel", 50, dep1));

        Product pr2 = productRepository.save(new Product("large shovel", 150, dep1));

        Product pr3 = productRepository.save(new Product("apple tree sapling", 10, dep2));

        Product pr4 = productRepository.save(new Product("assorted root vegetable seed packet", 2000, dep4));

        Product pr5 = productRepository.save(new Product("geranium seed packet", 1000, dep5));

        Product pr6 = productRepository.save(new Product("sprouted carrots", 200, dep2));

        Product pr7 = productRepository.save(new Product("large brim gardening hat", 25, dep6));


    }
}
