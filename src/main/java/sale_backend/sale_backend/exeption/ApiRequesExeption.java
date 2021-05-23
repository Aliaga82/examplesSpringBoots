package sale_backend.sale_backend.exeption;


public class ApiRequesExeption extends RuntimeException {
    public ApiRequesExeption(String message) {
        super(message);
    }
    public ApiRequesExeption(String message, Throwable throwable) {
        super(message, throwable);
    }
}
