package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import ru.ignios.mongotesting.entities.Profile;
import ru.ignios.mongotesting.entities.Users;



public interface UsersRepository extends MongoRepository<Users,String> {

    Users findByEmailMatches(String email);

    Users findByProfile_NameAndProfile_LastName(String _Name, String _LastName);

}
