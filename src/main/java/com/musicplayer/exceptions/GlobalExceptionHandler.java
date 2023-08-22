package com.musicplayer.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.musicplayer.exceptions.payload.ApiResponse;



@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		ResponseEntity<ApiResponse> handlerResourceNotFoundException = handlerResourceNotFoundException(ex);
	
		return new ResponseEntity<ApiResponse>(HttpStatus.NOT_ACCEPTABLE);
		
		
		
		
	}
}
