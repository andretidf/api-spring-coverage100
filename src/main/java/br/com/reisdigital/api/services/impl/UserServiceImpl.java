package br.com.reisdigital.api.services.impl;

import br.com.reisdigital.api.domain.User;
import br.com.reisdigital.api.dto.UserDTO;
import br.com.reisdigital.api.repositories.UserRepository;
import br.com.reisdigital.api.services.UserService;
import br.com.reisdigital.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public User findById(Integer id) {
        Optional<User> entity = repository.findById(id);

        return  entity.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }

}
