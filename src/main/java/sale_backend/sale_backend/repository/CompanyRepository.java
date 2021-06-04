package sale_backend.sale_backend.repository;


import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.accounting.Company;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company,Long> {
    List<Company>findAll();
}
