package com.zzy.robot.service.impl;

import com.zzy.robot.dao.UserMapper;
import com.zzy.robot.model.User;
import com.zzy.robot.service.UserService;
import com.zzy.robot.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/24.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
