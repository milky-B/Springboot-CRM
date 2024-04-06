package com.gdut.crm;

import cn.hutool.crypto.SecureUtil;
import org.junit.Test;

public class Md5SaltTest {
    @Test
    public void demo1(){
        String password="yf123";
        String salt = "332D1FC317D3FE85";
        String md5Salt = SecureUtil.md5(password+salt );
        System.out.println(md5Salt);

    }
}
