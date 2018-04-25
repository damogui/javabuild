package com.newthreeboard;

import org.springframework.stereotype.Service;
import pojo.User;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    @Resource
    private UserMapper userDao;
    public List<User> getAllUser() {

        return userDao.selectAllUser();
    }
}
