package sale_backend.sale_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sale_backend.sale_backend.domain.Adresses;

public interface AdressRepository extends JpaRepository <Adresses, Long> {
}
