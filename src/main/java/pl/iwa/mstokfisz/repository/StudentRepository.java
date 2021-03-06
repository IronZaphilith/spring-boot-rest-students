package pl.iwa.mstokfisz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.iwa.mstokfisz.model.Student;

@Repository
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public interface StudentRepository extends JpaRepository<Student, Long>{

}
