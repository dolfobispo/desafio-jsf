package com.logicbig.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.faces.view.ViewScoped;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
@ViewScoped
public class HelloController {

    @GetMapping
    public String Index (){
        return "/hello.jsf";
    }

    public String getLogin(String login, String senha){



        return "/hello.jsf";
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
