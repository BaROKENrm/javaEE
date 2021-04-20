package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.User;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    //查找用户
    User selectById(Integer id);

    //增加用户
    int insert(User user);


    //删除
    int deleteById(Integer id);
}
