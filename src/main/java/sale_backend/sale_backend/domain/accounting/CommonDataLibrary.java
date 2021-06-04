package sale_backend.sale_backend.domain.accounting;

import java.util.ArrayList;
import java.util.List;

public class CommonDataLibrary {
    public List<Currency> findAll(){
        List<Currency> currencies = new ArrayList<Currency>();
        currencies.add(new Currency("AZN", "944","Azərbaycan manatı"));
        currencies.add(new Currency("USD", "840","ABŞ dolları"));
        currencies.add(new Currency("RUB", "643","Rusiya  rublu"));
        currencies.add(new Currency("EUR", "944","Avro"));
        return  currencies;
    }
    public List<DeleteAction> findAllDeletions(){
        List<DeleteAction> deleteActions = new ArrayList<>();
        deleteActions.add(new DeleteAction(1,"Ehtiyac yaranmadi"));
        deleteActions.add(new DeleteAction(1,"Shirket legv etdi"));
        deleteActions.add(new DeleteAction(1,"Imtina etdi"));
        return deleteActions;
    }

}
