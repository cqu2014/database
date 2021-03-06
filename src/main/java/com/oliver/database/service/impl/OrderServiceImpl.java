package com.oliver.database.service.impl;

import com.alibaba.fastjson.JSON;
import com.oliver.database.entity.OrderEntity;
import com.oliver.database.entity.OrderItemEntity;
import com.oliver.database.mapper.OrderEntityMapper;
import com.oliver.database.mapper.OrderItemEntityMapper;
import com.oliver.database.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author Oliver Wang
 * @Description
 * @Created by IntelliJ IDEA 2018.
 * @Date Create at 2018/11/14 9:28
 */
@Service
@Slf4j
public class OrderServiceImpl  implements IOrderService {
    @Resource
    OrderEntityMapper orderEntityMapper;
    @Resource
    OrderItemEntityMapper orderItemEntityMapper;

    @Override
    public void addOrder(OrderEntity orderEntity) {
        orderEntityMapper.insertSelective(orderEntity);
        log.info("订单插入成功orderId={}",orderEntity.getOrderId());
    }

    @Override
    public void addOrderItem(OrderItemEntity orderItemEntity) {
        orderItemEntityMapper.insertSelective(orderItemEntity);
        log.info("订单详情插入成功:{}", JSON.toJSONString(orderItemEntity));
    }

    @Transactional
    @Override
    public void addFullOrder(OrderEntity orderEntity, OrderItemEntity orderItemEntity) {
        addOrder(orderEntity);
        addOrderItem(orderItemEntity);
    }
}
