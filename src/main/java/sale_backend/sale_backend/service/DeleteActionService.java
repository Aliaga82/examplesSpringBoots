package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.accounting.DeleteAction;
import sale_backend.sale_backend.repository.DeleteActionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DeleteActionService {
    private final DeleteActionRepository deleteActionRepository;

    public DeleteAction save (DeleteAction deleteAction){
        return deleteActionRepository.save(deleteAction);
    }

    public DeleteAction findById (long id){
        return deleteActionRepository.findById(id).orElse(null);
    }
    public List<DeleteAction>findAll(){
        return  deleteActionRepository.findAll();
    }
}
