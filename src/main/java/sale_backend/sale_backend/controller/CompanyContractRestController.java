package sale_backend.sale_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sale_backend.sale_backend.domain.accounting.Company;
import sale_backend.sale_backend.domain.accounting.Contract;
import sale_backend.sale_backend.dto.CompanyDto;
import sale_backend.sale_backend.dto.ContractDto;
import sale_backend.sale_backend.service.CommonDtoConverter;
import sale_backend.sale_backend.service.CompanyService;
import sale_backend.sale_backend.service.ContractService;

import java.util.List;

@RequestMapping("/contract")
@RestController
public class CompanyContractRestController {
    @Autowired
    CompanyService companyService;

    @Autowired
    ContractService contractService;

    @Autowired
    CommonDtoConverter commonDtoConverter;

    @PostMapping("/save")
    public CompanyDto save(@RequestBody CompanyDto companyDto) {
        Company company = commonDtoConverter.dtoToCompamny(companyDto);
        return commonDtoConverter.companytoDto(company);
    }

    @GetMapping(value = "/findBy/{id}")
    public Company findById(@PathVariable Long id) {
        return companyService.findByid(id);
    }


    @GetMapping(value = "/findAll")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping(value = "/findByContract/{id}")
    public Contract findByContractId(@PathVariable Long id){
        return contractService.findById(id);
    }
    @PostMapping  (value = "/company/save")
    public CompanyDto saveCompany(@RequestBody CompanyDto companyDto){
        Company company =commonDtoConverter.dtoToCompamny(companyDto);
        return commonDtoConverter.companytoDto(company);
    }

    @GetMapping(value =  "/findAllCntract")
    public List<Contract>findAllContract(){
        return contractService.findAll();
    }

    @PostMapping(value = "/type/save")
    public ContractDto  saveContract(@RequestBody ContractDto contractDto){
        Contract contract= commonDtoConverter.contractDto(contractDto);
        return commonDtoConverter.comContractDto(contract);
    }

    @PostMapping (value ="/deleted/{deletedId}/{conratcID}")
    public void deletedActionSet(@PathVariable Long deletedId, @PathVariable Long conratcID){
        contractService.saveFinByDeletedReason(
                deletedId,conratcID);
    }
}
