package ru.ignios.mongotesting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ignios.mongotesting.entities.Message;
import ru.ignios.mongotesting.entities.Users;
import ru.ignios.mongotesting.entities.UsersMessages;
import ru.ignios.mongotesting.repositories.UserMessagesRepository;

import java.util.Date;

@Service
public class MessagesServiceImpl{

    private UserMessagesRepository userMessagesRepository;

    @Autowired
    public MessagesServiceImpl(UserMessagesRepository userMessagesRepository) {
        this.userMessagesRepository = userMessagesRepository;
    }

    public String sendMessageFromTo(Users sender, Users recepient, String message){
        UsersMessages messageNew = new UsersMessages(sender,recepient,message);
        messageNew.setSend_at(new Date());
        messageNew.setRead(false);
        userMessagesRepository.save(messageNew);

        return "message added to db";
    }




}
