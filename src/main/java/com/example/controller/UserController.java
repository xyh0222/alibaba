package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        logger.info("开始创建用户: {}", user.getUsername());
        userMapper.insertUser(user);
        logger.info("用户创建成功: {}", user.getUsername());
        return ResponseEntity.ok("用户创建成功");
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        logger.info("查询所有用户");
        List<User> users = userMapper.getAllUsers();
        logger.debug("查询到{}个用户", users.size());
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        logger.info("根据ID查询用户: {}", id);
        User user = userMapper.getUserById(id);
        if (user != null) {
            logger.debug("查询到用户: {}", user.getUsername());
        } else {
            logger.warn("未找到ID为{}的用户", id);
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        logger.info("根据用户名查询用户: {}", username);
        User user = userMapper.getUserByUsername(username);
        if (user != null) {
            logger.debug("查询到用户: {}", user.getUsername());
        } else {
            logger.warn("未找到用户名为{}的用户", username);
        }
        return ResponseEntity.ok(user);
    }
}