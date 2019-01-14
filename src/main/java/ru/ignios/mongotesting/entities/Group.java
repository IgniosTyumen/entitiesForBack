package ru.ignios.mongotesting.entities;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "groups")
public class Group {

    @Id
            @Field("_id")
    String _id;

    Users creator;

    @Indexed
    String name;

    String description;

    @Indexed
    String inviting_code;

    boolean isPublic=false;

}
