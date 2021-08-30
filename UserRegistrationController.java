package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	
	
	@RequestMapping(value = "/userregistration", method = RequestMethod.POST)
    public String register(@RequestBody UserDetails userDetails)
    {

     
            System.out.println("Inserting User data");
            //System.out.println("Inserting Record with \nUsername: " + username + "\tPassword: " + password);
            String response=userRegistrationService.register(userDetails);
            return response;
            
            
        
    }
	

}
