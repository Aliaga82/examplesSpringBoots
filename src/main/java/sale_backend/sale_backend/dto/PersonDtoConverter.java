package sale_backend.sale_backend.dto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.repository.PersonRepository;
import sale_backend.sale_backend.service.PersonService;

@Service
public class PersonDtoConverter  {
    ModelMapper mapper;
    PersonRepository personRepository;

    public PersonDtoConverter(PersonRepository personRepository, ModelMapper  mapper) {
        this.mapper = mapper;
        this.personRepository = personRepository;
    }

    public PersonDto entityDto(Person person) {
        PersonDto dto=mapper.map(person,PersonDto.class);
        return dto;
    }

    public Person dtoToEntity(PersonDto personDto){
      Person person =mapper.map(personDto,Person.class);
      return person;
    }
}
