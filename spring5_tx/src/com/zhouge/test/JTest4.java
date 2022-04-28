package com.zhouge.test;

import com.zhouge.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring5 整合junit4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void testTransfer(){
        userService.transfer();
    }


}
