package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.accounting.Currency;
import sale_backend.sale_backend.repository.CurrencyRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CurrencyService  {
    private final CurrencyRepository  currencyRepository;

    public Currency save(Currency currency){
        return  currencyRepository.save(currency);
    }
    public Currency findbyID(long id ){
        return currencyRepository.findById(id).orElse(null);
    }
    public List<Currency> findAll(){
        return currencyRepository.findAll();
    }
}
