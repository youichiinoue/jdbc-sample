package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.model.Todo;
import com.sample.model.TodoDao;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TodoDao todoDao = (TodoDao) ctx.getBean("todoDaoImpl");
        todoDao.createTodo(1, "abc");
        todoDao.createTodo(2, "def");
        List<Todo> list = todoDao.getAll();
        System.out.println( "Hello World!" + list.size() );
    }
}
