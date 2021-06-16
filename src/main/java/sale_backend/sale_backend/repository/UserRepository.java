package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String usename);
    List<User>findAll();
}
