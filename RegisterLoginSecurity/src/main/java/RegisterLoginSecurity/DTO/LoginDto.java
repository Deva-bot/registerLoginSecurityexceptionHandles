package RegisterLoginSecurity.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDto 
{

	@NotBlank(message = "Password is mandatory")
	private String password;

	@NotBlank(message = "userName or Email is mandatory")
	private String userNameOrEmail;

}