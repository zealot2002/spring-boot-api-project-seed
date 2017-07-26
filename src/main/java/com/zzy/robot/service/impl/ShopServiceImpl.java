package com.zzy.robot.service.impl;

import com.zzy.robot.dao.ShopMapper;
import com.zzy.robot.model.Admin;
import com.zzy.robot.model.Shop;
import com.zzy.robot.service.ShopService;

import tk.mybatis.mapper.entity.Condition;

import com.zzy.robot.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/26.
 */
@Service
@Transactional
public class ShopServiceImpl extends AbstractService<Shop> implements ShopService {
    @Resource
    private ShopMapper shopMapper;

	@Override
	public void save(Shop shop) {
		Date date = new Date();
		shop.setCreateTime(date);
		super.save(shop);
	}

	@Override
	public long count() {
		Condition condition=new Condition(Shop.class);
        condition.createCriteria().andCondition("1=1");
		long count = shopMapper.selectCountByCondition(condition);
		return count;
	}

    
    
}
