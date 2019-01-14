package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.UsersMessages;

public interface UserMessagesRepository extends MongoRepository<UsersMessages,String> {


}
