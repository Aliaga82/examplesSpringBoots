package sale_backend.sale_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sale_backend.sale_backend.domain.Child;
import sale_backend.sale_backend.domain.MerchadiseGroup;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.dto.PersonDto;
import sale_backend.sale_backend.dto.PersonDtoConverter;
import sale_backend.sale_backend.service.ChildService;
import sale_backend.sale_backend.service.MerchadiseGroupService;
import sale_backend.sale_backend.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/library/group")
public class LibrarryController {
    @Autowired
    MerchadiseGroupService merchadiseGroupService;

    @Autowired
    PersonService personService;

    @Autowired
    ChildService childService;

    @Autowired
    PersonDtoConverter personDtoConverter;


    @GetMapping(value = "/findAll")
    public List<MerchadiseGroup> findAll() {
        return merchadiseGroupService.findAll();
    }

    @PostMapping(value = "/save")
    public PersonDto save(@RequestBody PersonDto personDto) {
        Person person=personDtoConverter.dtoToEntity(personDto);
        return personDtoConverter.entityDto(person);
    }

    @GetMapping("/child/findAll")
    public List<Child> findAllchild() {
        return childService.findAll();
    }

    @GetMapping("/person/findAll")
    public List<PersonDto> finAllPerson() {
        List<Person> persons = personService.findAll();
        return  personDtoConverter.dtoToEntityFindAll(persons);
    }
}

