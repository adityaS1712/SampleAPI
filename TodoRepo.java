package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepo   extends MongoRepository<UserDetails,String>{
	
	
		
		//private final JdbcTemplate jdbcTemplate ;
		
	
		
	
	

}
