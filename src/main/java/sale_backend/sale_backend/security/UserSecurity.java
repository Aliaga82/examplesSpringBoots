package sale_backend.sale_backend.security;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.exeption.ApiRequesExeption;
import sale_backend.sale_backend.repository.UserRepository;
import sale_backend.sale_backend.domain.User;




@Service
@AllArgsConstructor
public class UserSecurity implements UserDetailsService {
    @Autowired  UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user =userRepository.findByUsername(userName);
        if (user==null){
            throw new ApiRequesExeption("User not found");
        }
        return   new UserPrinciple(user);
    }
}
