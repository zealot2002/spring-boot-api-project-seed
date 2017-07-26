package com.zzy.robot.service;
import com.zzy.robot.model.Admin;
import com.zzy.robot.core.Service;


/**
 * Created by CodeGenerator on 2017/07/24.
 */
public interface AdminService extends Service<Admin> {
	Admin login(Admin admin);
}
