package org.mybatis.bu.persistence;

import java.util.List;

import org.mybatis.bu.domain.Order;

public interface OrderMapper {

  List<Order> getOrdersByUsername(String username);

  Order getOrder(int orderId);
  
  void insertOrder(Order order);
  
  void insertOrderStatus(Order order);

}
