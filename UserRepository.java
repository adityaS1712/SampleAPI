package hello;

/**
 * Created by Aditya Sangar on 28/08/2021.
 */
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String>{

}
