package br.com.reisdigital.api.services;

import br.com.reisdigital.api.domain.User;

import java.util.List;


public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
