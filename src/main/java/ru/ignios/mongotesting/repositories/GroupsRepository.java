package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.Group;

public interface GroupsRepository extends MongoRepository<Group,String> {
}
