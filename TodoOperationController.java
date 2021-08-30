package hello;

import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.servlet.http.HttpSession;

/**
 * Created by Aditya Sangar on 13/6/17.
 */
@RestController
public class TodoOperationController {


    @Autowired
    TodoOperationRepository todoOperationRepository;

    @RequestMapping(value = "/addTodo", method = RequestMethod.POST, produces = "application/json")
    public String addTodo(@RequestBody TodoInput todoInput,
                               HttpSession session) {
        System.out.println("add Todo Request!");

        if(session.isNew()){
            return "User not logged in error!!";
        }
        else{
            //get user balance from user repository
        	todoOperationRepository.saveCategory(todoInput.getCategory());
        }
        return "Check Balanced Called!";
    }
    
    
    @RequestMapping(value = "/removeTodo", method = RequestMethod.POST, produces = "application/json")
    public String removeTodo(@RequestBody TodoInput todoInput,
                               HttpSession session) {
        System.out.println("remove Todo Request!");

        if(session.isNew()){
            return "User not logged in error!!";
        }
        else{
            //get user balance from user repository
        	todoOperationRepository.delete(todoInput.getCategory());
        }
        return "Check Balanced Called!";
    }
    
    @RequestMapping(value = "/updateTodoStatus", method = RequestMethod.POST, produces = "application/json")
    public String updateTodo(@RequestBody TodoInput todoInput,
                               HttpSession session) {
        System.out.println("update  Todo Request!");

        if(session.isNew()){
            return "User not logged in error!!";
        }
        else{
            //get user balance from user repository
        	todoOperationRepository.update(todoInput.getCategory());
        }
        return "Check Balanced Called!";
    }
    
    
    
    @RequestMapping(value = "/filterList", method = RequestMethod.POST, produces = "application/json")
    public List<TodoInput> filterList(@RequestBody TodoInput todoInput,
                               HttpSession session) {
        System.out.println("Filter list  Todo Request!");


            //get user balance from user repository
        	List<TodoInput> list=todoOperationRepository.filter(todoInput.getCategory(),todoInput.getDateTime());
        	
     return list;
     
    }
    
    
    
    
}
