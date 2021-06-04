package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.accounting.Company;
import sale_backend.sale_backend.repository.CompanyRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class CompanyService {
    private final CompanyRepository companyRepository;

    public Company findByid(Long id){
        return companyRepository.findById(id).orElse(null);
    }
    public List<Company>findAll(){
        return companyRepository.findAll();
    }
    public Company save (Company company){
        return  companyRepository.save(company);
    }


}
