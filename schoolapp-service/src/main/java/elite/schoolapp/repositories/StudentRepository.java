package elite.schoolapp.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import elite.schoolapp.entities.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, String> {

}
