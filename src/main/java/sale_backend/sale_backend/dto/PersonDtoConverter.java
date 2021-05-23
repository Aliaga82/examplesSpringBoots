package sale_backend.sale_backend.dto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.repository.PersonRepository;


@Service
public class PersonDtoConverter {
    @Autowired
    ModelMapper mapper;
    @Autowired
    PersonRepository personRepository;

    public PersonDto entityDto(Person person) {
        return mapper.map(person, PersonDto.class);

    }

    public Person dtoToEntity(PersonDto personDto) {
        return mapper.map(personDto, Person.class);
    }
}
