package ru.ignios.mongotesting.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "users.tokens")
public class UsersTokens {

    @Id
    String _id;

    Users user;

    @Indexed
    String unique_token;

    String user_ip;

    String agent;

    Date date;


}
