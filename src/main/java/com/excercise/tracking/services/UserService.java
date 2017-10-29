package com.excercise.tracking.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.excercise.tracking.model.User;

@Path("/user")
public class UserService {

	@GET
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validateAndLogin(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		if (username.equals("admin") && password.equals("password")){
			return Response.ok().build();
		}
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
}
