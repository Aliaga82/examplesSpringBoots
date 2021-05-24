package sale_backend.sale_backend.domain.accounting;

import lombok.Data;
import org.dom4j.tree.AbstractBranch;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table( name ="t_financial_section")
public class FinancialSection extends AbstractInfo {
}
