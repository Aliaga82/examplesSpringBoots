package sale_backend.sale_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sale_backend.sale_backend.domain.Child;
import sale_backend.sale_backend.domain.MerchadiseGroup;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.domain.User;
import sale_backend.sale_backend.dto.ChildDto;
import sale_backend.sale_backend.dto.PersonDto;
import sale_backend.sale_backend.dto.UserDto;
import sale_backend.sale_backend.service.*;

import javax.validation.Valid;
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
    CommonDtoConverter personDtoConverter;

    @Autowired
    UserSerice userSerice;


    @GetMapping(value = "/findAll")
    public List<MerchadiseGroup> findAll() {
        return merchadiseGroupService.findAll();
    }

    @PostMapping(value = "/save")
    public PersonDto save(@Valid @RequestBody PersonDto personDto) {
        Person person=personDtoConverter.dtoToEntity(personDto);
        return personDtoConverter.entityDto(person);
    }

    @GetMapping("/child/findAll")
    public List<ChildDto> findAllchild() {
       List<Child> child =childService.findAll();
       return personDtoConverter.childDtoEntity(child);

    }

    @GetMapping("/person/findAll")
    public List<PersonDto> finAllPerson() {
        List<Person> persons = personService.findAll();
        return  personDtoConverter.dtoToEntityFindAll(persons);
    }

    @PostMapping("/user/save")
    public UserDto saveuserDto(@RequestBody UserDto userDto){
         User user= personDtoConverter.dtoToUser(userDto);
         return  personDtoConverter.userToDto(user);
    }

    @PostMapping("/sendMail/{username}")
    public void sendMail(@PathVariable String username){
        userSerice.resetPasswordByUserEmail(username);
    }

    @GetMapping ("/person/findBy/{id}")
    public PersonDto findbyId(@PathVariable Long id){
       return personDtoConverter.dtofindById(id);
    }

    @GetMapping("/child/findById/{id}")
    public ChildDto findById(@PathVariable Long id){
        return personDtoConverter.childDtobyId(id);
    }
}

