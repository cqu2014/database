package com.oliver.database.service;

import com.oliver.database.entity.OrderEntity;
import com.oliver.database.entity.OrderItemEntity;

/**
 * @Author Oliver Wang
 * @Description
 * @Created by IntelliJ IDEA 2018.
 * @Date Create at 2018/11/13 16:04
 */
public interface IOrderService {
    /**
     * 增加订单
     * @param orderEntity
     */
    void addOrder(OrderEntity orderEntity);

    /**
     * 增加订单详情
     * @param orderItemEntity
     */
    void addOrderItem(OrderItemEntity orderItemEntity);

    /**
     * 增加完整订单信息
     *
     * @param orderEntity
     * @param orderItemEntity
     */
    void addFullOrder(OrderEntity orderEntity,OrderItemEntity orderItemEntity);
}
