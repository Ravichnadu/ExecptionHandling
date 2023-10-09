package com.marolix.execption.serverapi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	
	@GetMapping("/wellcome")
	public String  getWellcomeMsg()
	{
		String msg ="hello world..!";
		
		int i=10/0;
		return msg;
	}
}
