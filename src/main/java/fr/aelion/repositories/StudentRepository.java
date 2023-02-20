package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
   private List<Student> students = new ArrayList();
    public StudentRepository() {
        this.populate();
    }

    public Student findByLoginAndPassword(String login, String password) {
        for (Student student : this.students) {
            if (student.getUsername() == login && student.getPassword() == password) {
                return student;
            }
        }
        return null;
    }

    public int size() {
        return this.students.size();
    }
    private void populate(){


        // Make an instance of Student
        Student student = new Student ("Aubert", "Jean-Luc", "jean-luc.aubert@aelion.fr");
        student.setUsername("bond");
        student.setPassword("007");

        //Add student list
        this.students.add(student);
    }
}
