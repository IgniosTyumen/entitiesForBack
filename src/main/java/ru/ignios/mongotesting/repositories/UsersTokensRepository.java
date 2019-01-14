package ru.ignios.mongotesting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.ignios.mongotesting.entities.UsersTokens;

public interface UsersTokensRepository extends MongoRepository<UsersTokens,String> {
}
