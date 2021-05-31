package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.accounting.Currency;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
    List<Currency>findAll();
}
