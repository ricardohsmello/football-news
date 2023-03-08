package br.com.ricas.service;


import br.com.ricas.domain.entity.User;
import br.com.ricas.infrastructure.entity.UserEntity;
import br.com.ricas.infrastructure.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    private UserRepository userRepository;
    @Transactional
    public UserEntity create(User user)  {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());

        userRepository.persist(userEntity);

        return userEntity;
    }
    @Transactional
    public List<UserEntity> list()  {
        return userRepository.listAll();
    }

}
