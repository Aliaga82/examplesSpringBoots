package sale_backend.sale_backend.domain.accounting;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "t_contract")
public class Contract extends AbstractInfo {
    @ManyToOne
    private Company company;

    private Date insertDate;

    @ManyToOne
    private DeleteAction deleteAction;

}
