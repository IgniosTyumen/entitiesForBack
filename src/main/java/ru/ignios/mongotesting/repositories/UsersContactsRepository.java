package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.UsersContacts;

public interface UsersContactsRepository extends MongoRepository<UsersContacts,String> {
}
