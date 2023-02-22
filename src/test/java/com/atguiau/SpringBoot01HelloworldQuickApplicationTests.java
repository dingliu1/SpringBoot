package com.atguiau;

import com.atguiau.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {
    Logger logger = LoggerFactory.getLogger(SpringBoot01HelloworldQuickApplicationTests.class);
    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        logger.info("this is a info test message");
        logger.debug("this is a info test message");
        System.out.println(person);
    }

}
