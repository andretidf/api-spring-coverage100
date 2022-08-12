package br.com.reisdigital.api.services;

import br.com.reisdigital.api.domain.User;
import br.com.reisdigital.api.dto.UserDTO;

import java.util.List;


public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
