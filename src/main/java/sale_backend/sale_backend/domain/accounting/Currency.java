package sale_backend.sale_backend.domain.accounting;
import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_currency")
public class Currency extends AbstractInfo {
    private String isoCode;
    private String currencyCode;

    public Currency (String isoCode, String currencyCode, String info){
        this.isoCode=isoCode;
        this.currencyCode=currencyCode;
        super.setInfo(info);
    }
}
