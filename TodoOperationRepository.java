package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


	@Repository
	public interface TodoOperationRepository   extends MongoRepository<TodoInput,String>{

		
		@Query("insert into  TodoInput u set u.category=:category where u.firstName = ?1")
		void saveCategory(@Param("category") String category);

		
		
		@Query("delete from TodoInput u where u.firstName =:name and category=:category")
		void delete(@Param("category") String category,@Param("name") String name);


		@Query("update  TodoInput u set status=where u.firstName =:name and category=:category")
		void update(String category);


		@Query("select * from TodoInput where category=:category OR date=:date")
		List<TodoInput> filter(@Param("category") String category,@Param("date") String date);
		
		
		
		
		
		
		
		
			
			//private final JdbcTemplate jdbcTemplate ;
			
		
			
		
		

	}
