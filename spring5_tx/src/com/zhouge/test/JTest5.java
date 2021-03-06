package com.zhouge.test;

import com.zhouge.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/*@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:tx.xml")*/

@SpringJUnitConfig(locations = "classpath:tx.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void testTransfer(){
        userService.transfer();
    }

}
