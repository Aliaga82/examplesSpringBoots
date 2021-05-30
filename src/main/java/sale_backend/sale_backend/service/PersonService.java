package sale_backend.sale_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.Person;
import sale_backend.sale_backend.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person saveperson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(long id){
        return personRepository.findById(id).orElse(null);
    }

}
