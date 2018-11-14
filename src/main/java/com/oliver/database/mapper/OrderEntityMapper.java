package com.oliver.database.mapper;

import com.oliver.database.entity.OrderEntity;

public interface OrderEntityMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    OrderEntity selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}