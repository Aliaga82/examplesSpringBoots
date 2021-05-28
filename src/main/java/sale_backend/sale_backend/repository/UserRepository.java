package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String usename);
}
