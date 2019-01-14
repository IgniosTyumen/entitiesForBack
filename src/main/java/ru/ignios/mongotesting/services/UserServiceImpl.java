package ru.ignios.mongotesting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ignios.mongotesting.entities.Profile;
import ru.ignios.mongotesting.entities.Users;
import ru.ignios.mongotesting.repositories.UsersRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;


@Service
public class UserServiceImpl implements UserService{

    UsersRepository userRepository;

    @Autowired
    public void setUserRepository(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addNewUser(Users user) {

          Users compare = userRepository.findByEmailMatches(user.getEmail());
          if (compare == null){
              userRepository.save(user);
              return userRepository.findByEmailMatches(user.getEmail()).getId();
          }
          return "";
    }

    public String addNewTestUser() {
        Users randomUser = new Users();
        randomUser.setEmail(RandomStringUtil.randomString(10));
        randomUser.setPassword(RandomStringUtil.randomString(10));
        randomUser.setCreated_at(new Date());
        randomUser.setProfile(new Profile(RandomStringUtil.randomString(5), RandomStringUtil.randomString(5), new Date()));
        return userRepository.save(randomUser).getId();
    }

    public Users getRandomUserFromDB(){
        List<Users> users =userRepository.findAll();
        int length = users.size();
        Random random = new Random();
        return users.get(random.nextInt(length-1));
    }


    @Override
    public Users getTestUser1() {
        return userRepository.findByProfile_NameAndProfile_LastName("big","dick");
    }

    @Override
    public Users getTestUser2() {
        return userRepository.findByProfile_NameAndProfile_LastName("big","ass");
    }

    public Users findUserByID(String id){

        return userRepository.findById(id).get();
    }

    public Users findByEmail(String email){
        return userRepository.findByEmailMatches(email);
    }

}
