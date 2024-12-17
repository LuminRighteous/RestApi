package com.ab.restapi.service;

import com.ab.restapi.entity.UserEntity;
import com.ab.restapi.model.User;
import com.ab.restapi.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UserRepository userRepository;
    @Override

    public void userRegister(User user) {
       UserEntity userEntity= modelMapper.map(user, UserEntity.class);
        userRepository.save(userEntity);
    }
}
