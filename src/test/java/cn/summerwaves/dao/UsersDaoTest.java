package cn.summerwaves.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@ContextConfiguration(locations = {"classpath:shiro-spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersDaoTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    public void findUserByUsername() {
        System.out.println(usersDao.findUserByUsername("user"));
    }
}