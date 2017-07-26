package com.zzy.robot.web;
import com.zzy.robot.core.Result;
import com.zzy.robot.core.ResultGenerator;
import com.zzy.robot.model.PageRequestCtx;
import com.zzy.robot.model.Shop;
import com.zzy.robot.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/26.
*/
@CrossOrigin
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Resource
    private ShopService shopService;

    @PostMapping("/add")
    public Result add(@RequestBody Shop shop) {
        shopService.save(shop);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer id) {
        shopService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Shop shop) {
        shopService.update(shop);
        return ResultGenerator.genSuccessResult();
    }
    @RequestMapping("/count")
    public Result count() {
        long count = shopService.count();
        return ResultGenerator.genSuccessResult(count);
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Shop shop = shopService.findById(id);
        return ResultGenerator.genSuccessResult(shop);
    }

    @RequestMapping("/list")
    public Result list(@RequestBody PageRequestCtx ctx) {
    	System.out.println("ShopController list ctx.getPageNum() "+ctx.getPageNum()+" ctx.getPageSize()"+ctx.getPageSize());
        PageHelper.startPage(ctx.getPageNum(), ctx.getPageSize());
        List<Shop> list = shopService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
