package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Adresses;
import sale_backend.sale_backend.repository.AdressRepository;

@Service
@AllArgsConstructor
public class AdressService {
private final AdressRepository adressRepository;
public Adresses save(Adresses adresses){
    return  adressRepository.save(adresses);
     }
}
