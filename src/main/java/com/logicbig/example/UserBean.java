package com.logicbig.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.faces.view.ViewScoped;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;

@Component
@ViewScoped
public class UserBean {

    @Autowired
    private MsgService msgService;

    public String getMsg() {
        return msgService.getMsg();
    }

    public Collection<User> getAllUsers(){
        User user  = new User();
        user.setLogin("Rodolfo");
        user.setSenha("122344");

        User user2 = new User();
        user2.setLogin("Julio");
        user2.setSenha("213123");

        return Arrays.asList(user,user2);
    }
}