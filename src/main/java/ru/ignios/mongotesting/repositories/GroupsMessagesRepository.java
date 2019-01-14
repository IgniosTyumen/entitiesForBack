package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.GroupsMessages;

public interface GroupsMessagesRepository extends MongoRepository<GroupsMessages,String> {
}
