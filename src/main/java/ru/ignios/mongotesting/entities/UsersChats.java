package ru.ignios.mongotesting.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users.chats")
public class UsersChats {

    @Id
    String _id;

    Users user_id;

    Message message;
}
