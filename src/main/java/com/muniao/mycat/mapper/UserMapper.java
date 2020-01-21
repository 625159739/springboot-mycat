package com.muniao.mycat.mapper;

import com.muniao.mycat.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name) value (#{id},#{name})")
    int insert(UserEntity user);

    @Select("select * from user")
    List<UserEntity> selectAll();
}
