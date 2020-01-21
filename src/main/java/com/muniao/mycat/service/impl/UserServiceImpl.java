package com.muniao.mycat.service.impl;

import com.muniao.mycat.entity.UserEntity;
import com.muniao.mycat.mapper.UserMapper;
import com.muniao.mycat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(UserEntity user) {
        return userMapper.insert(user);
    }

    @Override
    public List<UserEntity> selectAll() {
        return userMapper.selectAll();
    }
}
