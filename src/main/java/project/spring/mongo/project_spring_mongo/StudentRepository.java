package project.spring.mongo.project_spring_mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findStudentyByEmail(String email);
}
