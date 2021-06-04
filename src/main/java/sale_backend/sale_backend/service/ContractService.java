package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.accounting.Contract;
import sale_backend.sale_backend.repository.ContractRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;

    public Contract save (Contract contract){
        contract.setInsertDate(new Date());
        return contractRepository.save(contract);
    }

    public Contract findById (Long id){
        return contractRepository.findById(id).orElse(null);
    }

    public List<Contract> findAll(){
       return contractRepository.findAll();
    }
}
