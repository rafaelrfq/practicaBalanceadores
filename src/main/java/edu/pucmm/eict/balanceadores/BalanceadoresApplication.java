package edu.pucmm.eict.balanceadores;

import edu.pucmm.eict.balanceadores.entities.security.User;
import edu.pucmm.eict.balanceadores.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BalanceadoresApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BalanceadoresApplication.class, args);

        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");

        if(userRepository.findAll().size() >= 1){
            System.out.println("Default users exist");
        } else {
            User user1 = new User("rafael", "rafael", "Rafael Felipe", "ADMIN");
            User user2 = new User("juan", "juan", "Juan Lopez", "USER");
            userRepository.save(user1);
            userRepository.save(user2);
        }
    }
}