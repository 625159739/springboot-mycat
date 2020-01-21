package com.muniao.mycat.service;

import com.muniao.mycat.entity.UserEntity;

import java.util.List;

public interface UserService {
    int insert(UserEntity user);
    List<UserEntity> selectAll();
}
