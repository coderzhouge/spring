package com.zhouge.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testLog {

    private static final Logger log = LoggerFactory.getLogger(testLog.class);

    public static void main(String[] args) {
        log.info("hello 傻狗");
        log.warn("hello 我真帅！！");
        log.info("兄弟  睡觉了 ！不搞了 熬不住你！");
    }
}
