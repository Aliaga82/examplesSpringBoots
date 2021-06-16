package sale_backend.sale_backend.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Child;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.domain.User;
import sale_backend.sale_backend.domain.accounting.Company;
import sale_backend.sale_backend.domain.accounting.Contract;
import sale_backend.sale_backend.dto.*;
import sale_backend.sale_backend.repository.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CommonDtoConverter {
    @Autowired
    ModelMapper mapper;
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @Autowired
    UserSerice userSerice;

    @Autowired
    ChildService childService;

    @Autowired
    CompanyService companyService;

    @Autowired
    ContractService contractService;

    public PersonDto entityDto(Person person) {
        personService.saveperson(person);
        return mapper.map(person, PersonDto.class);
    }

    public Person dtoToEntity(PersonDto personDto) {
        return mapper.map(personDto, Person.class);
    }

    public List<PersonDto> dtoToEntityFindAll(List<Person> personDto) {
        return personDto
                .stream()
                .map(dtos -> mapper.map(dtos, PersonDto.class))
                .collect(Collectors.toList());
    }

    public List<Person> entityToDtoFindAll(List<PersonDto> personDtos) {
        return personDtos
                .stream().
                        map(persons -> mapper.map(persons, Person.class)).
                        collect((Collectors.toList()));
    }

    public List<ChildDto> childDtoEntity(List<Child> children) {
        return children
                .stream()
                .map(child -> mapper.map(child, ChildDto.class))
                .collect(Collectors.toList());
    }

    public UserDto userToDto(User user) {
        return mapper.map(userSerice.save(user), UserDto.class);
    }

    public User dtoToUser(UserDto userDto) {
        return mapper.map(userDto, User.class);
    }
    public PersonDto dtofindById(long id){
        Person person= personService.findById(id);
        return mapper.map(person,PersonDto.class);
    }

    public ChildDto childDtobyId(long id){
        Child child = childService.findById(id);
        return mapper.map(child,ChildDto.class);
    }

    public CompanyDto companytoDto(Company company){
        return mapper.map(companyService.save(null),CompanyDto.class);
    }

    public Company dtoToCompamny(CompanyDto companyDto){
        return  mapper.map(companyDto, Company.class);
    }

    public ContractDto comContractDto(Contract comContract){
        contractService.save(comContract);
        return mapper.map(comContract, ContractDto.class);
    }

    public Contract contractDto(ContractDto contractDto){
        return mapper.map(contractDto, Contract.class);
    }
}
