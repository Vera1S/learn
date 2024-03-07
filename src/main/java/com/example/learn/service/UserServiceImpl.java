package com.example.learn.service;

import com.example.learn.repository.UserRepository;
import com.example.learn.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()){
           return optionalUser;
        }
        return optionalUser;
    }

    @Override
    @Transactional
    public Optional<User> create(User user) {
        Optional<User> optionalUserCreate = Optional.of(userRepository.save(user));
        if (optionalUserCreate == null){
            return optionalUserCreate;
        }
        return optionalUserCreate;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (id != null && userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
    }

    @Override
    @Transactional
    public Optional<User> update(Long id, User user) {
        Optional<User> persistUserOptional = userRepository.findById(id);
        if (persistUserOptional.isPresent()){  //если есть
            User persistUser = persistUserOptional.get();  //покажи
            persistUser.setName(user.getName());   //в старого user устанавливаем новое имя
            persistUser.setEmail(user.getEmail());
            persistUser.setId(user.getId());
            persistUser.setRating(user.getRating());
            userRepository.save(persistUser);  //пересохраняем старого user на новый
        }

        return persistUserOptional;
    }
}
