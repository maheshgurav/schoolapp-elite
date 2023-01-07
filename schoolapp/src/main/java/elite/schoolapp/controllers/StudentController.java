package elite.schoolapp.controllers;

import elite.schoolapp.entities.Student;
import elite.schoolapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

  @Autowired private StudentService studentService;

  @GetMapping(path = "/{studentId}")
  public ResponseEntity<Student> getStudentById(
      @PathVariable(value = "studentId") String studentId) {
    return new ResponseEntity<Student>(studentService.getStudent(studentId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Student> createStudent(@RequestBody Student student) {
    Student studentFromDb = studentService.createStudent(student);
    return new ResponseEntity<Student>(studentFromDb, HttpStatus.CREATED);
  }

  @PatchMapping(path = "/{studentId}")
  public ResponseEntity<Student> updateStudent(
      @RequestBody Student student, @PathVariable(value = "studentId") String studentId) {
    Student studentFromDb = studentService.updateStudent(studentId, student);
    return new ResponseEntity<Student>(studentFromDb, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{studentId}")
  public ResponseEntity<Boolean> deleteStudent(
      @PathVariable(value = "studentId") String studentId) {
    return new ResponseEntity<Boolean>(studentService.deleteStudent(studentId), HttpStatus.OK);
  }
}
