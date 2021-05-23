package sale_backend.sale_backend.exeption;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiExeption {
    private final String error;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

    public ApiExeption(String error, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.error = error;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    public String getError() {
        return error;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
