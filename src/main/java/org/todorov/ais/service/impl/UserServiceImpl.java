package org.todorov.ais.service.impl;

import org.springframework.stereotype.Service;
import org.todorov.ais.repository.UserRepository;
import org.todorov.ais.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



}

