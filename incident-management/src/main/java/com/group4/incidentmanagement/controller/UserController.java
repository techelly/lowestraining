package com.group4.incidentmanagement.controller;

import com.group4.incidentmanagement.entities.Incident;
import com.group4.incidentmanagement.entities.User;
import com.group4.incidentmanagement.exceptions.NotAbleToSaveUserException;
import com.group4.incidentmanagement.exceptions.UserNotFoundException;
import com.group4.incidentmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    String[] getAllUsers() {
        return new String[]{"Check", "Point"};
    }


    //Create or save or add
    //http://localhost:8080/addstudent
    @PostMapping("/adduser")
    public User createUser(@RequestBody User user) throws NotAbleToSaveUserException {
        return userService.createUser(user);

    }

    //Retrieve or get student on the basis of Primary Key
    //http://localhost:8080/getstudentbyid/1
    @GetMapping("/getuserbyid/{id}")
    public User retrieveUser(@PathVariable("id") Integer userId) throws UserNotFoundException {
        return userService.retrieveUser(userId);
    }
    
    
    @GetMapping("/getuser{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<User> getUser(@PathVariable("id") Integer userId) throws UserNotFoundException {
    	User user = userService.retrieveUser(userId);
    	return new ResponseEntity<User>(user,HttpStatus.FOUND);
    }
}
