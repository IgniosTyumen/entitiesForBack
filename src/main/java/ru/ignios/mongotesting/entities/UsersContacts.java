package ru.ignios.mongotesting.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "users.contacts")
public class UsersContacts {

    @Id
    String _id;

    @Indexed
    Users user_id;

    @DBRef
    Users contact;

    String byName;

    Date addedAt;

}
