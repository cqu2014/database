package com.oliver.database.mapper;

import com.oliver.database.entity.OrderItemEntity;
import org.springframework.stereotype.Repository;

@Repository("OrderItemEntityMapper")
public interface OrderItemEntityMapper {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(OrderItemEntity record);

    int insertSelective(OrderItemEntity record);

    OrderItemEntity selectByPrimaryKey(Long orderItemId);

    int updateByPrimaryKeySelective(OrderItemEntity record);

    int updateByPrimaryKey(OrderItemEntity record);
}