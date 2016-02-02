package org.mybatis.bu.persistence;

import java.util.List;

import org.mybatis.bu.domain.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
