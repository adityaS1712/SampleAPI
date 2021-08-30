package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{
	
	@Autowired
	TodoRepo todoRepo;
	
	
	@Transactional
	public String register(UserDetails userDetails)
	{
		try
		{
			todoRepo.save(userDetails);
			return "success";
			
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
		
		
	}
	
	

}
