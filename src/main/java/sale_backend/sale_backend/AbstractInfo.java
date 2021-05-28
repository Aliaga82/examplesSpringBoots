package sale_backend.sale_backend;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class AbstractInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;

}
