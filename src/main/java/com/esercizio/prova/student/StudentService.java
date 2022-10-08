package com.esercizio.prova.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Gianni Fantoni",
                        "giannifantoni@gmail.com",
                        LocalDate.of(1990, Month.DECEMBER, 5),
                        32
                )
        );
    }
}
