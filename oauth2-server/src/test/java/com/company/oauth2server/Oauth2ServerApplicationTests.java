package com.company.oauth2server;

import com.company.oauth2server.model.User;
import com.company.oauth2server.repository.UserDetailRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class Oauth2ServerApplicationTests {


    /*@Autowired
    private UserDetailRepository userRepository;*/

    @Test
    void contextLoads() {
       /* Optional<User> optionalUser=userRepository.findByUsername("a");
        boolean a=optionalUser.isPresent();
        assert a;*/
    }

}
