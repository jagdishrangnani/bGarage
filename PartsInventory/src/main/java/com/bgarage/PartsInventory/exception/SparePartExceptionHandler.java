package com.bgarage.PartsInventory.exception;

import com.bgarage.PartsInventory.dto.SparePartErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SparePartExceptionHandler {

    @ExceptionHandler(SparePartNotFoundException.class)
    public ResponseEntity<?> handleSparePartNotFoundException(SparePartNotFoundException ex){
        SparePartErrorResponse errorResponse = new SparePartErrorResponse();
        errorResponse.setErrorMessage(ex.getMessage());
        errorResponse.setErrorCode("P000");
        return ResponseEntity.internalServerError().body(errorResponse);
    }

}
