package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.GroupsMembers;


public interface GroupsMembersRepository extends MongoRepository<GroupsMembers,String> {
}
