package com.tienda.service;

import java.util.Set;

import com.tienda.bean.Order;
import com.tienda.bean.Product;
import com.tienda.bean.User;
import com.tienda.bean.Wishlist;
import com.tienda.util.DataStore;
import com.tienda.util.OrderNotFoundException;
import com.tienda.util.ProductNotFoundException;
import com.tienda.util.UserNotFoundException;
import com.tienda.util.WishlistNotFoundException;

public class TiendaService {
	//this class contains the business services 
	  
	public User getUserDetails(String username) throws UserNotFoundException
	{
		return new DataStore().getUser(username) ;
	}
	
	public Product getProductDetails(String code) throws ProductNotFoundException
	{
		return new DataStore().getProduct(code) ;
	}
	
	public Order getOrderDetailsForUser(String username, String number) throws OrderNotFoundException
	{
		return new DataStore().getOrderForUser(username, number) ;
	}
	
	public Set<Order> getAllOrdersForUser(String username)
	{
		return new DataStore().getAllOrdersForUser(username) ;
	}
	
	public Wishlist getWishlistForUser(String username) throws WishlistNotFoundException
	{
		return new DataStore().getWishlistForUser(username) ;
	}

	

}
