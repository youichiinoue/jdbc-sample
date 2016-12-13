package com.sample.model;

import com.sample.model.Todo;
import com.sample.model.TodoDao;
import com.sample.model.TodoRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoDaoImpl implements TodoDao {
  private JdbcTemplate jdbcTemplate;

  public TodoDaoImpl() {
  }

  @Override
  public void createTodo(int id, String name) {
    jdbcTemplate.update("insert into todo (id, name) values (?, ?)", new Object[] { id, name });
  }

  @Override
  public List<Todo> getAll() {
    return jdbcTemplate.query("select * from todo", new TodoRowMapper());
  }

  @Autowired
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
}
