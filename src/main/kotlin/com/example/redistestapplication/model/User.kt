package com.example.redistestapplication.model

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("User")
class User(
    @Id
    var firstName: String,
    var secondName: String
)