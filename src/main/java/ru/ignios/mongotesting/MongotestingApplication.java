package ru.ignios.mongotesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ru.ignios.mongotesting.entities.Users;
import ru.ignios.mongotesting.services.MessagesServiceImpl;
import ru.ignios.mongotesting.services.UserServiceImpl;


@SpringBootApplication
@EnableMongoRepositories
public class MongotestingApplication implements CommandLineRunner {

	private UserServiceImpl userServiceImpl;
	private MessagesServiceImpl messagesServiceImpl;

	@Autowired
	public void setMessagesServiceImpl(MessagesServiceImpl messagesServiceImpl) {
		this.messagesServiceImpl = messagesServiceImpl;
	}

	@Autowired
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}



	public static void main(String[] args) {
		SpringApplication.run(MongotestingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		for (int i = 0; i < 10; i++) {
			userServiceImpl.addNewTestUser();
		}
		Users user1 = userServiceImpl.getRandomUserFromDB();
		Users user2 = userServiceImpl.getRandomUserFromDB();
		messagesServiceImpl.sendMessageFromTo(user1, user2, "foooobar");

	}
}

