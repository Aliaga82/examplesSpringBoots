package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.accounting.Contract;
import sale_backend.sale_backend.domain.accounting.DeleteAction;
import sale_backend.sale_backend.exeption.ApiRequesExeption;
import sale_backend.sale_backend.repository.ContractRepository;
import sale_backend.sale_backend.repository.DeleteActionRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
    private final DeleteActionRepository deleteActionRepository;

    public Contract save(Contract contract) {
        contract.setInsertDate(new Date());
        return contractRepository.save(contract);
    }

    public Contract findById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    public void saveFinByDeletedReason(long deleteIid, long conratcID) {
        DeleteAction action = deleteActionRepository.findById(deleteIid).orElse(null);
        Contract contract = findById(conratcID);
        if (contract.getDeleteAction() == null)  {
            contract.setDeleteAction(action);
            contractRepository.save(contract);
        } else {
            throw new ApiRequesExeption("Xeta tapildi");
        }

    }
}
