package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.MerchadiseGroup;

import java.util.List;

public interface MerchadiseGroupRepository extends CrudRepository<MerchadiseGroup, Long> {
    List<MerchadiseGroup> findAll();
}
