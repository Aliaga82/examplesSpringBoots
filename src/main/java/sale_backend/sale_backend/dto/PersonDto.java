package sale_backend.sale_backend.dto;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

@Data
public class PersonDto extends AbstractInfo {
    private String name;
    private String surname;
    private String fatherName;
    private String email;

    }
