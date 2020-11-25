package edu.pucmm.eict.balanceadores;

import com.hazelcast.config.Config;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.web.WebFilter;
import edu.pucmm.eict.balanceadores.entities.security.User;
import edu.pucmm.eict.balanceadores.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

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

    @Bean
    public Config config() {
        return new Config();
    }

    @Bean
    public WebFilter webFilter(@Qualifier("hazelcastInstance") HazelcastInstance hazelcastInstance) {

        Properties properties = new Properties();
        properties.put("instance-name", hazelcastInstance.getName());
        properties.put("sticky-session", "false");

        return new WebFilter(properties);
    }
}