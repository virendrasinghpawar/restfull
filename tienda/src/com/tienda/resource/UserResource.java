package com.tienda.resource;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.Order;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;


@Path("/users")
public class UserResource { // resource class
	
	//@Path("/my-method")
	@GET
	//@Produces(value="application/json") //MIME type/Media type
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	
	@Path("{uname}") // template parameter
	public User fetchUserDetails(@PathParam("uname")/*@QueryParam("uname")*/String username) throws UserNotFoundException // resource method(must be mapped to http GET)
	{
		User user  ;
		user = new TiendaService().getUserDetails(username) ;
		return user ;
	}
	
	public Object getSubResource() // sub-resource locator 
	{
		return null ;
	}
	
	
	

}
