package com.singtel.assignment.restful.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.singtel.assignment.config.ErrorMessage;
import com.singtel.assignment.exception.AssignmentException;
import com.singtel.assignment.model.animal.Animal;
import com.singtel.assignment.restful.model.AnimalResponse;

@ControllerAdvice
public class AssignmentExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<AnimalResponse<Animal>> handleThrowable(Throwable throwable) {
		AnimalResponse<Animal> response = new AnimalResponse<>();
		
		if (throwable instanceof AssignmentException) {
			response.setErrorCode(((AssignmentException) throwable).getErrorCode());
			response.setErrorMsg(((AssignmentException) throwable).getErrorMsg());										
		} else {
			response.setErrorCode(ErrorMessage.ASGMT_ERR_001);
			response.setErrorMsg(ErrorMessage.getErrorMsg(ErrorMessage.ASGMT_ERR_001, ""));
		}
		
		ResponseEntity<AnimalResponse<Animal>> responseEntity = 
				ResponseEntity.status(HttpStatus.OK).body(response);
		
		return responseEntity;
	}

}
