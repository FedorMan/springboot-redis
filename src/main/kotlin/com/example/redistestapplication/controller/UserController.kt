package com.example.redistestapplication.controller

import com.example.redistestapplication.model.User
import com.example.redistestapplication.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    val userRepository: UserRepository
) {

    @GetMapping("/all")
    fun gelAll(): MutableIterable<User> {
        return userRepository.findAll()
    }

    @GetMapping("/create")
    fun create(): User {
        val user = User("fer", "her");
        return userRepository.save(user)
    }

}