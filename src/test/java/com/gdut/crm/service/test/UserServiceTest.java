package com.gdut.crm.service.test;

import cn.hutool.crypto.SecureUtil;
import com.gdut.crm.pojo.User;
import com.gdut.crm.service.user.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void test01(){
        System.out.println("*****************************************************");
        System.out.println(SecureUtil.md5("123456" + "A25C8818B3405CB2"));
    }
    @Test
    public void test02(){
    }
}
