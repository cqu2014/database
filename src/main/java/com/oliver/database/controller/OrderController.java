package com.oliver.database.controller;

import com.oliver.database.service.impl.DataGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Oliver Wang
 * @Description
 * @Created by IntelliJ IDEA 2018.
 * @Date Create at 2018/11/14 10:21
 */
@RestController
@RequestMapping(value = "/sharding")
public class OrderController {
    @Resource
    DataGenerator dataGenerator;

    @GetMapping(value = "/generator")
    public Object generator(@RequestParam int nums){
        dataGenerator.generateData(nums);

        return "OK";
    }

}
