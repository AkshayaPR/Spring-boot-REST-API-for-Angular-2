package pack.Todo_list.repository;
import pack.Todo_list.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TodoListRepository extends JpaRepository<TodoList,Integer>
{

}