package sale_backend.sale_backend.dto;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

@Data
public class ChildDto extends AbstractInfo {
    private String childName;
    private int childAge;
    private PersonDto personDto;
}
