package com.vsk.expensetrackerapi.services;

import com.vsk.expensetrackerapi.domain.User;
import com.vsk.expensetrackerapi.exception.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
