package com.example.demo1.student.config;

import com.example.demo1.student.model.Student;
import com.example.demo1.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return Args->{
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5));

            Student anna = new Student(
                    "Anna",
                    "anna@gmail.com",
                    LocalDate.of(2000, MARCH, 7));
            repository.saveAll(List.of(mariam, anna));
        };
    }
}
