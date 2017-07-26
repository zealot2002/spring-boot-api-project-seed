package com.zzy.robot.service.impl;

import com.zzy.robot.dao.AdminMapper;
import com.zzy.robot.model.Admin;
import com.zzy.robot.service.AdminService;

import tk.mybatis.mapper.entity.Condition;

import com.zzy.robot.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/24.
 */
@Service
@Transactional
public class AdminServiceImpl extends AbstractService<Admin> implements AdminService {
    @Resource
    private AdminMapper adminMapper;

	@Override
	public Admin login(Admin admin) {
		
		Condition condition=new Condition(Admin.class);
        condition.createCriteria().andCondition("username='"+admin.getUsername()+"' and password='"+admin.getPassword()+"'");
        List<Admin> list = adminMapper.selectByCondition(condition);
        if(list.size()>0){
        	return list.get(0);
        }else{
        	return null;
        }
	}

}
