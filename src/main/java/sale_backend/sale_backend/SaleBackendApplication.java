package sale_backend.sale_backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sale_backend.sale_backend.domain.accounting.CommonDataLibrary;
import sale_backend.sale_backend.repository.CurrencyRepository;
import sale_backend.sale_backend.repository.DeleteActionRepository;


@SpringBootApplication
public class SaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleBackendApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public CommandLineRunner commandLineRunner(CurrencyRepository currencyRepository, DeleteActionRepository deleteActionRepository) {
        return args -> {

           currencyRepository.saveAll(new CommonDataLibrary().findAll());

            deleteActionRepository.saveAll(new CommonDataLibrary().findAllDeletions());
        };

    }
}
