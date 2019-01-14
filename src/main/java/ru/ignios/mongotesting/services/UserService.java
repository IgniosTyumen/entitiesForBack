package ru.ignios.mongotesting.services;

import org.springframework.stereotype.Service;
import ru.ignios.mongotesting.entities.Users;

@Service
public interface UserService {

     String addNewUser(Users user);
    Users getTestUser1();
    Users getTestUser2();

}
