package com.example.demo.service.user;

import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.UserDto;
import com.example.demo.entity.user.UserEntity;
import com.example.demo.repasitory.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.hibernate.hql.spi.id.local.LocalTemporaryTableBulkIdStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private ApiResponse apiResponse;

    public String signIn(UserEntity userEntity){
        if (check(userEntity)) {
            return userEntity.getUsername() + " is already exist!";
        }
        else {
            userRepository.save(userEntity);
            return "/user_page";
        }
    }

    public boolean check(UserEntity userEntity){
        Optional<UserEntity> userEntity1 =
                userRepository.findByUsername(userEntity.getUsername());
        if (userEntity1.isPresent()) return true;
        else return false;
    }

    public UserDto getById(Long id){
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()){
            UserDto userDto = new UserDto(user.get().getUsername());
            return userDto;
        }
        else return new UserDto();
    }

    public List<UserDto> getAll(){
        List<UserEntity> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        for (UserEntity u : users){
            UserDto userDto = new UserDto(u.getUsername());
            userDtos.add(userDto);
        }
        return userDtos;
    }


}
