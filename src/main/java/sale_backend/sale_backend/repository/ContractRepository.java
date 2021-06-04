package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.accounting.Contract;

import java.util.List;

public interface ContractRepository extends CrudRepository <Contract, Long> {
     List<Contract>findAll();
     Contract findContractById(Long id);
}
