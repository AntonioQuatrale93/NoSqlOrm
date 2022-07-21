package it.develhope.NoSqlExercise.repositories;

import it.develhope.NoSqlExercise.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
