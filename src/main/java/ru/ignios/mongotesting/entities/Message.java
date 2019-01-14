package ru.ignios.mongotesting.entities;

import com.mongodb.lang.Nullable;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


@Data
@RequiredArgsConstructor()
public class Message {

    @Id
    String _id;

    @Nullable
    Group group = null;

    @DBRef(db = "users")
    Users sender;

    String preview;

    Integer unread;
}
