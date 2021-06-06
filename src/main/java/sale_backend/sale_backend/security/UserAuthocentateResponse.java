package sale_backend.sale_backend.security;


public class UserAuthocentateResponse {
    private final String jwt;

    public UserAuthocentateResponse(String jwt) {
        this.jwt = jwt;
    }
    public String getJwt(){
        return jwt;
    }
}
