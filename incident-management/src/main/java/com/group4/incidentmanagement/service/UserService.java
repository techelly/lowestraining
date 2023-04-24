package com.group4.incidentmanagement.service;

import com.group4.incidentmanagement.entities.User;
import com.group4.incidentmanagement.exceptions.NotAbleToSaveUserException;
import com.group4.incidentmanagement.exceptions.UserNotFoundException;

public interface UserService {
    //Create or save or add
    public User createUser(User user) throws NotAbleToSaveUserException;

    //Retrieve or get student on the basis of Primary Key
    public User retrieveUser(Integer userId) throws UserNotFoundException;

    //Update
    public User updateUser(User user);

    //Delete
    public void deleteUser(Integer userId);
}
