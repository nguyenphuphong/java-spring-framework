package vn.kase.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import vn.kase.spring.model.SampleError;

@ControllerAdvice
public class SampleExceptionHandler {
    
    @ExceptionHandler(value = SampleException.class)
    public ResponseEntity<SampleError> handleException(RuntimeException ex, WebRequest request) {
        return new ResponseEntity<SampleError>(SampleError.builder().code("001").message(ex.getMessage()).build(), HttpStatus.BAD_REQUEST);
    }
}
