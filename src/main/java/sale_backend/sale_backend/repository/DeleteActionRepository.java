package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.accounting.DeleteAction;

import java.util.List;

public interface DeleteActionRepository extends CrudRepository <DeleteAction, Long> {
    List<DeleteAction> findAll();
}
