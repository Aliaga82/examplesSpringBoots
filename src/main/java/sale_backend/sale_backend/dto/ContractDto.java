package sale_backend.sale_backend.dto;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;
import sale_backend.sale_backend.domain.accounting.Company;
import javax.persistence.ManyToOne;
import java.util.Date;
   @Data
   public class ContractDto extends AbstractInfo {
    @ManyToOne
    private Company company;

    private Date insertDate;
}
