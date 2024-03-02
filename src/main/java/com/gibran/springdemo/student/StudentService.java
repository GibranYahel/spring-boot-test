package com.gibran.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of (
                new Student (
                        "Gibran",
                        "San Luis",
                        LocalDate.now(),
                        "contact@gibrancoding.com",
                        23

                ),
                new Student (
                        "Tiare 13",
                        "Mendoza Olvera",
                        LocalDate.now(),
                        "contact@Tiarecoding.com",
                        22

                )
        );
    }
}
