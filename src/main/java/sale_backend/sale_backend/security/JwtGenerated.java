package sale_backend.sale_backend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;
@Service
public class JwtGenerated {
    private static final Logger logger = LoggerFactory.getLogger(JwtGenerated.class);
    private static final String SID = "SECRET";

    private int jwtExpirationInMs = 86400000;

    public String generateToken(UserDetails user) {
        return generateTokenByUserName(user.getUsername());
    }

    public String generateTokenByUserName(String username) {
        String jwtSecret = convert(UUID.randomUUID().toString());

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        Claims claims = Jwts.claims().setSubject(username);
        claims.put(SID, username);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }


    public String generateToken(String user) {
        String jwtSecret = convert(UUID.randomUUID().toString());

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        Claims claims = Jwts.claims().setSubject(user);
        claims.put(SID, user);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public static String convert(String sid) {
        return Base64.getEncoder().encodeToString(sid.getBytes());
    }
}
