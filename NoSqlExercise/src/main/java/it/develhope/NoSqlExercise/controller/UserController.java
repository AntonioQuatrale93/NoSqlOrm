package it.develhope.NoSqlExercise.controller;

import it.develhope.NoSqlExercise.entities.User;
import it.develhope.NoSqlExercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void createUserInDb(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsersInDb() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserInDbById(@PathVariable String id){
        return userService.getuserById(id);

    }

    @DeleteMapping
    public void deleteAllUsersInDb() {
        userService.deleteAllUsers();
    }

    @PutMapping("/{id}")
    public User updateUserInDb(@PathVariable String id, @RequestBody User user) throws Exception {
        return userService.updateUser(id, user);
    }


    @DeleteMapping("/{id}")
    public void deleteUsersInDbById(@PathVariable String id) {
        userService.deleteUserById(id);
    }


}
