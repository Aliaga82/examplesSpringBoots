package sale_backend.sale_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.MerchadiseGroup;
import sale_backend.sale_backend.repository.MerchadiseGroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchadiseGroupService {


 private final MerchadiseGroupRepository merchadiseGroupRepository;

    public MerchadiseGroup save(MerchadiseGroup merchadiseGroup) {
        return merchadiseGroupRepository.save(merchadiseGroup);
    }

    public List<MerchadiseGroup> findAll() {
        return merchadiseGroupRepository.findAll();
    }


    public  void delete (Long id){
        merchadiseGroupRepository.deleteById(id);
    }


}
