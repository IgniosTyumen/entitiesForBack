package ru.ignios.mongotesting.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "groups.messages")
public class GroupsMessages {

    @Id
    String _id;

    Users sender;

            @Indexed
    Group group;

    String text;

    Date sended_at;
}
