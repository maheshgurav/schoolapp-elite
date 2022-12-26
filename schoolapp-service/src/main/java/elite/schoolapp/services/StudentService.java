package elite.schoolapp.services;

import elite.schoolapp.entities.Student;

public interface StudentService {
  Student getStudent(String uuid);

  Student createStudent(Student student);

  Student updateStudent(String uuid, Student student);

  boolean deleteStudent(String uuid);
}
