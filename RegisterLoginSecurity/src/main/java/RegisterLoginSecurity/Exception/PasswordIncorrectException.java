package RegisterLoginSecurity.Exception;

public class PasswordIncorrectException extends RuntimeException
{
	public PasswordIncorrectException(String message)
	{
		super(message);
	}
}
