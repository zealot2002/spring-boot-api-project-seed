package com.zzy.robot.service.impl;

import com.zzy.robot.dao.CommodityMapper;
import com.zzy.robot.model.Commodity;
import com.zzy.robot.service.CommodityService;
import com.zzy.robot.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/24.
 */
@Service
@Transactional
public class CommodityServiceImpl extends AbstractService<Commodity> implements CommodityService {
    @Resource
    private CommodityMapper commodityMapper;

}
