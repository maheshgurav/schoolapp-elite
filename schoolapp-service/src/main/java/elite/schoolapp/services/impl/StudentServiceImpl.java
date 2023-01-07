package elite.schoolapp.services.impl;

import elite.schoolapp.entities.Student;
import elite.schoolapp.repositories.StudentRepository;
import elite.schoolapp.services.StudentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Priyda This class is to support student related operation
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	/**
	 * This method returns Student details based on uuid
	 */
	public Student getStudent(String uuid) {

		Student student = null;
		Optional<Student> studentFromDb = studentRepository.findById(uuid);
		if (studentFromDb.isPresent()) {
			student = studentFromDb.get();
		}
		return student;
	}

	/**
	 * This method creates a Student
	 */
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	/**
	 * This method update a Student based on uuid
	 */
	public Student updateStudent(String uuid, Student student) {
		Student studentFromDb = getStudent(uuid);
		if (studentFromDb == null) {
			return null;
		}
		return studentRepository.save(student);
	}

	/**
	 * This method deletes a Student based on uuid
	 */

	public boolean deleteStudent(String uuid) {
		Student studentFromDb = getStudent(uuid);
		if (studentFromDb == null) {
			return false;
		}
		studentRepository.delete(studentFromDb);
		return true;
	}
}
