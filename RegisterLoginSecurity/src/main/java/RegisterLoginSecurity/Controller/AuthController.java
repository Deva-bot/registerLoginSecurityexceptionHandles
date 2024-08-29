package RegisterLoginSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RegisterLoginSecurity.DTO.LoginDto;
import RegisterLoginSecurity.DTO.UserRegisterDto;
import RegisterLoginSecurity.Service.AuthService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private AuthService authService;

	@PostMapping("/register")
	public ResponseEntity<String> userRegister(@RequestBody @Valid UserRegisterDto userRegisterDto) {
		String userRegister = authService.userRegister(userRegisterDto);
		return new ResponseEntity<String>(userRegister, HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody @Valid LoginDto loginDto) 
	{
		String loginResponse = authService.userLogin(loginDto);
		return new ResponseEntity<>(loginResponse, HttpStatus.OK);
	}
}
