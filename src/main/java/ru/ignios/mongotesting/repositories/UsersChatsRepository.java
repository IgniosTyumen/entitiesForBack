package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.UsersChats;

public interface UsersChatsRepository extends MongoRepository<UsersChats,String> {
}
