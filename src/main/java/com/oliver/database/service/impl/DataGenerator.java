package com.oliver.database.service.impl;

import com.oliver.database.entity.OrderEntity;
import com.oliver.database.entity.OrderItemEntity;
import com.oliver.database.service.IOrderService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @Author Oliver Wang
 * @Description
 * @Created by IntelliJ IDEA 2018.
 * @Date Create at 2018/11/14 10:11
 */
@Component
public class DataGenerator {
    @Resource
    IOrderService iOrderService;

    public void generateData(int nums){
        Random random = new Random();
        while(nums-- >0){
            long orderId = random.nextInt(10000);

            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setOrderId(orderId);
            orderEntity.setUserId(100000-nums);
            orderEntity.setStatus("Waiting for paying");
            iOrderService.addOrder(orderEntity);

            OrderItemEntity orderItemEntity = new OrderItemEntity();
            orderItemEntity.setOrderId(orderId);
            orderItemEntity.setUserId(orderEntity.getUserId());
            iOrderService.addOrderItem(orderItemEntity);
        }
    }
}
