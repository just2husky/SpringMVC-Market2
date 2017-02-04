package com.pancake.service;

import java.util.List;

import com.pancake.entity.GoodForm;
import com.pancake.entity.OrderTable;

public interface ShowOrderService {
	public OrderTable getOrderById(java.lang.Integer orderId);
	public OrderTable createOrder(String buyerName, int goodId, String address,
			String description);
	public List<OrderTable> getOrderByBuyerName(String userName);
}
