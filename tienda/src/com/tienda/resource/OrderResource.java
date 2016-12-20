package com.tienda.resource;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.tienda.bean.Order;

public class OrderResource {
	
	@GET
	public Order fetchOrderDetailsForUser(String username,String number)
	{
		return null ;
	}
	@GET
	public Set<Order> fetchAllOrdersForUser(String username)
	{
		return null ;
	}
	@POST
	public void createOrder(Order order)
	{
		
	}

}
