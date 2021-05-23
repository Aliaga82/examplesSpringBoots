package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Child;
import sale_backend.sale_backend.repository.ChildRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChildService {
    private final ChildRepository childRepository;

    public Child save(Child child) {
        return childRepository.save(child);
    }

    public List<Child> findAll() {
        return childRepository.findAll();
    }
}
