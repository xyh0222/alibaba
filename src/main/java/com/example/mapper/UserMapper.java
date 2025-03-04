package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    
    // 插入用户数据
    void insertUser(User user);
    
    // 查询所有用户
    List<User> getAllUsers();
    
    // 根据ID查询用户
    User getUserById(Long id);
    
    // 根据用户名查询用户
    User getUserByUsername(String username);
}