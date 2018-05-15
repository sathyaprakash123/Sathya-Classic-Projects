package marvel.com.example.ultron;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class superman {
	
	private String name;
	private Integer age;
	
	public String getName()
	{
		return name;
	}
	public Integer getAge()
	{
		return age;
	}

	
	@RequestMapping(value = "/postmethod", method=RequestMethod.POST)
    public String superId(@RequestBody superman sman)
	{
		
		return "The name of the person is " + sman.getName() + " ane his age is "+ sman.getAge() + " .The request method is Post";
	
	
	}

}
