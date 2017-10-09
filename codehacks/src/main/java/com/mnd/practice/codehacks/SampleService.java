package com.mnd.practice.codehacks;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/sample1")
public class SampleService {
	
	@GET
	public String getPath() {
		return "/Sample";
	}

}
