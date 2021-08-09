package in.anand.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anand.props.AppProperties;

@RestController
public class IniviteController {
	@Autowired
	private AppProperties aprop;
	
	@GetMapping("/wish")
	public String wish()
	{
		Map<String, String> messages = aprop.getMessages();
		String msg = messages.get("greetingsMsg");
		return msg;
		
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		Map<String, String> messages = aprop.getMessages();
		String msg = messages.get("welcomeMsg");
		return msg;
		
	}

}
