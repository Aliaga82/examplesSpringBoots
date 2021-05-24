package sale_backend.sale_backend.domain.accounting;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "t_financial_sub_numbers")
public class FinancialSubNumbers extends AbstractInfo {
    @ManyToOne
    private FinancialAccountNumbers financialAccountNumbers;
}
