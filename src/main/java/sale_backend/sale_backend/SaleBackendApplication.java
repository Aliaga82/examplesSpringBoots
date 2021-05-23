package sale_backend.sale_backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sale_backend.sale_backend.domain.MerchadiseGroup;

@SpringBootApplication
public class SaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleBackendApplication.class, args);
    }
    @Bean
   public ModelMapper modelMapper(){
        return new ModelMapper();
   }
}
