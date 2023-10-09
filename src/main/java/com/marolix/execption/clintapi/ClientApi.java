package com.marolix.execption.clintapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.execption.userexecption.UserNotFoundExecption;

@RestController
public class ClientApi {
	
	@GetMapping("/user/{userid}")
	public String getUsername(@PathVariable("userid") Integer userId) throws Exception
	{
		if(userId==100)
		{
			return "ravi";
		}
		else if (userId==100) 
		{
			return "adarsh";
		} else 
		  throw new UserNotFoundExecption("user not found");
	}

}
