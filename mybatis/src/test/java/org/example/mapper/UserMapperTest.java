package org.example.mapper;

import org.example.Application;
import org.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//指定为Spring环境中的单元测试
@RunWith(SpringRunner.class)
//指定为SpringBoot环境的单元测试，Application为启动类
@SpringBootTest(classes = Application.class)
//使用事务，在SpringBoot的单元测试中会自动回滚
@Transactional
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserByIdTest(){
        User user = userMapper.selectById(6);
        System.out.println(user);
    }

    @Test
    public void insertTest() {
        User user =  new User("654","asd");
        userMapper.insert(user);
        System.out.println(user.getId());
    }

    @Test
    public void deleteById(){
        userMapper.deleteById(8);
    }
}
