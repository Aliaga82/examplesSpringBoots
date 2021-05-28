package sale_backend.sale_backend.dto;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;
 @Data
public class UserDto extends AbstractInfo{
    private String password;
    private String username;
}
