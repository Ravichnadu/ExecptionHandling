package com.marolix.execption.userexecption;

public class UserNotFoundExecption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundExecption()
	{
		
	}
	
	public UserNotFoundExecption( String msg)
	{
		super(msg);
	}
	
	

}
