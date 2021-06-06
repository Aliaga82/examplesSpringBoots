package sale_backend.sale_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sale_backend.sale_backend.domain.User;
import sale_backend.sale_backend.dto.UserDto;
import sale_backend.sale_backend.security.JwtGenerated;
import sale_backend.sale_backend.security.UserAuthocentateResponse;
import sale_backend.sale_backend.security.UserSecurity;
import sale_backend.sale_backend.service.CommonDtoConverter;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserSecurity userSecurity;

    @Autowired
    JwtGenerated jwtGeerated;

    @Autowired
    CommonDtoConverter commonDtoConverter;

    @PostMapping(value = "/")
    public ResponseEntity  createAUntenticateToken(@RequestBody UserDto userDto)  throws IllegalArgumentException{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDto.getUsername(), userDto.getPassword()));
        } catch (BadCredentialsException e){
            throw new IllegalArgumentException("Sehv user name",e);
        }
          final UserDetails userDetails =userSecurity.loadUserByUsername(userDto.getUsername());
          final String jwt = jwtGeerated.userDetatls(userDetails);

        return  ResponseEntity.ok(new UserAuthocentateResponse(jwt));
     }

    @PostMapping("/save")
    public UserDto saveuserDto(@RequestBody UserDto userDto){
        User user= commonDtoConverter.dtoToUser(userDto);
        return  commonDtoConverter.userToDto(user);
    }
    }
