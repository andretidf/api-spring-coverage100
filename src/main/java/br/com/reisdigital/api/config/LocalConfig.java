package br.com.reisdigital.api.config;

import br.com.reisdigital.api.domain.User;
import br.com.reisdigital.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Valdir", "valdir@mail.com", "123");
        User u2 = new User(null, "André", "andre@mail.com", "123");
        User u3 = new User(null, "Gisele", "gisele@mail.com", "123");

        repository.saveAll(List.of(u1, u2, u3));

    }
}
