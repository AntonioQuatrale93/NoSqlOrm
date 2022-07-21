package it.develhope.NoSqlExercise.service;

import it.develhope.NoSqlExercise.entities.User;
import it.develhope.NoSqlExercise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<User> getuserById(String id){
        return userRepository.findById(id);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    public User updateUser(String id, User user) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User not found");
        user.setId(id);
        return userRepository.save(user);
    }


}
