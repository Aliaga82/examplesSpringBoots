package sale_backend.sale_backend.dto;

import io.minio.messages.Identity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
 @NoArgsConstructor
 @AllArgsConstructor
public class UserDto{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String username;
    private String password;

}
