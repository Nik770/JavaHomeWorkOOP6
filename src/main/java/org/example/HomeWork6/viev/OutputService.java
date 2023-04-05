package org.example.HomeWork6.viev;

import org.example.HomeWork5.model.School;

public interface OutputService {
    void all(School school);
    void allTeacher(School school);
    void allStudents(School school);
    void teacher(School school , int id_grope);
    void studentsOfGrope(School school, int id_grope);
}