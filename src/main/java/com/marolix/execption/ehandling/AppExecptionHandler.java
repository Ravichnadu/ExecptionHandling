package com.marolix.execption.ehandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.marolix.execption.info.InfoExecption;
import com.marolix.execption.userexecption.UserNotFoundExecption;

@RestControllerAdvice
public class AppExecptionHandler {

	@ExceptionHandler(value = UserNotFoundExecption.class)
	public ResponseEntity<InfoExecption> HandlerExecption(UserNotFoundExecption e)
	{
		String exMsg=e.getMessage();
		
		InfoExecption ie=new InfoExecption();
		ie.setCode("SBIEXOOO1");
		ie.setMsg(exMsg);
		ie.setTime(LocalDateTime.now());
		
		return new ResponseEntity<InfoExecption>(ie,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<InfoExecption> handlerExecption(Exception e)
	{
		String exMsg=e.getMessage();
		
		InfoExecption ie=new InfoExecption();
		ie.setCode("SBIEXOOO3");
		ie.setMsg(exMsg);
		ie.setTime(LocalDateTime.now());
		
		return new ResponseEntity<InfoExecption>(ie,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
