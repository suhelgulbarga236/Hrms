package com.Tech.Hrms.exceptions;

@SuppressWarnings("serial")
public class UserAlreadyExistException extends RuntimeException {

public UserAlreadyExistException(String message) {
	throw new UserAlreadyExistException("user alreay exist exception");
}
}
