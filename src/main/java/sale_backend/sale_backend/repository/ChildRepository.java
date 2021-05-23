package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.Child;

import java.util.ArrayList;

public interface ChildRepository extends CrudRepository<Child, Long> {
    ArrayList<Child> findAll();
}
