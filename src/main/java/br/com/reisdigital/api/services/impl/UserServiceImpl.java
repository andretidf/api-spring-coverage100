package br.com.reisdigital.api.services.impl;

import br.com.reisdigital.api.domain.User;
import br.com.reisdigital.api.repositories.UserRepository;
import br.com.reisdigital.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> entity = repository.findById(id);

        return  entity.orElse(null);
    }
}
