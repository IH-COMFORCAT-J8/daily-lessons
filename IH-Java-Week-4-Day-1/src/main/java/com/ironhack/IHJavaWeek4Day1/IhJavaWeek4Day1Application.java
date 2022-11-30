package com.ironhack.IHJavaWeek4Day1;

import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.*;
import java.util.*;

@SpringBootApplication
public class IhJavaWeek4Day1Application implements CommandLineRunner {


    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(IhJavaWeek4Day1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        productRepository.saveAll(List.of(
                new Product("Pokemon", new BigDecimal("49.01"), Category.COMMERCIAL_NEW, Department.ELECTRONICS),
                new Product("Pooka Shell Bracelet", new BigDecimal("49.10"), Category.HANDMADE, Department.JEWELRY),
                new Product("Commodore 64", new BigDecimal("429.20"), Category.COMMERCIAL_USED, Department.ELECTRONICS),
                new Product("Baby Blue Tuxedo", new BigDecimal("149.20"), Category.COMMERCIAL_USED, Department.CLOTHING),
                new Product("Rectangular Persian Rug", new BigDecimal("800.90"), Category.HANDMADE, Department.HOMEGOODS)

        ));

    }
}
