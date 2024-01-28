package net.javaguides.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.management.RuntimeErrorException;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public  ResourceNotFoundException(String message)
    {
        super(message);
    }
}
