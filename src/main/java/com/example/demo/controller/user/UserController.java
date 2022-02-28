package com.example.demo.controller.user;

import com.example.demo.dto.response.UserDto;
import com.example.demo.entity.user.UserEntity;
import com.example.demo.repasitory.user.UserRepository;
import com.example.demo.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController{

    private UserService userService;

    @PostMapping(value = "/sign_up")
    public String signUp(@RequestBody UserEntity userEntity){
        return userService.signIn(userEntity);
    }


    @GetMapping(value = "/get/{id}")
    public UserDto getByid(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping(value = "/get_all")
    public List<UserDto> getAll(){
        return userService.getAll();
    }
}
