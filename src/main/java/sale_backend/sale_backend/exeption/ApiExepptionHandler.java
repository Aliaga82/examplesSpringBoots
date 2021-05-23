package sale_backend.sale_backend.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExepptionHandler {
    @ExceptionHandler(value = {ApiRequesExeption.class})
    public ResponseEntity<Object> responseEntity(ApiRequesExeption e) {
        HttpStatus badreques = HttpStatus.BAD_REQUEST;
        ApiExeption apiRequesExeption = new ApiExeption(e.getMessage(),
                badreques,
                ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(apiRequesExeption, HttpStatus.BAD_REQUEST);
    }

}
