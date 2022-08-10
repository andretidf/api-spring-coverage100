package br.com.reisdigital.api.services;

import br.com.reisdigital.api.domain.User;


public interface UserService {

    User findById(Integer id);
}
