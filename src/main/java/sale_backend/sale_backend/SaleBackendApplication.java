package sale_backend.sale_backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sale_backend.sale_backend.domain.accounting.Currency;
import sale_backend.sale_backend.domain.accounting.CurrencyEnam;
import sale_backend.sale_backend.repository.CurrencyRepository;


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
    public CommandLineRunner commandLineRunner(CurrencyRepository currencyRepository) {
        return args -> {
            Currency currency = currencyRepository.findById(1L).orElse(null);
            if (currency == null) {
                currencyRepository.saveAll(new CurrencyEnam().findAll());
            }
        };

    }
}
