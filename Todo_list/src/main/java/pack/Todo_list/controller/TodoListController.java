package pack.Todo_list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import pack.Todo_list.model.*;
import pack.Todo_list.repository.TodoListRepository;
@CrossOrigin("*")
@RequestMapping("/listEvents")
@RestController
public class TodoListController
{
    @Autowired
    TodoListRepository todor;
    @GetMapping
    public List<TodoList> getEvents()
    {
         return todor.findAll();
    }

    @PostMapping
    public void saveEvents(@RequestBody TodoList todo)
    {

        todor.save(todo);
    }
    @DeleteMapping("{eventNo}")
    public void deleteEvents(@PathVariable Integer eventNo)
    {
        todor.delete(eventNo);
    }
    
    @PutMapping("{eventNo}")
    public void updateEvents(@PathVariable Integer eventNo,@RequestBody TodoList todo)
    {
        TodoList td=todor.getOne(eventNo);
        td.setEventName(todo.getEventName());
        td.setEventDescription(todo.getEventDescription());
        td.setDate(todo.getDate());
        td.setLocation(todo.getLocation());
        td.setTime(todo.getTime());
        todor.saveAndFlush(td);
    }
}