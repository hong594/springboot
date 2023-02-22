package com.qs.springbootmybatisplus;

import com.qs.springbootmybatisplus.dao.UserinfoDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootmybatisplusApplicationTests {

    @Autowired
    private UserinfoDao userinfoDao;

    @Test
    void contextLoads() {
        System.out.println(userinfoDao.selectList(null));
    }

}
