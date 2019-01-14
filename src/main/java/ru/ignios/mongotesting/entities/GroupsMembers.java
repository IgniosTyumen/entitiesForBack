package ru.ignios.mongotesting.entities;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "groups.members")
public class GroupsMembers {

    @Id
    String _id;

    Group group;

    List<Users> member;
}
