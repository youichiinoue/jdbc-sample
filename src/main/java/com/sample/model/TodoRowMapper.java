package com.sample.model;

import com.sample.model.Todo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TodoRowMapper implements RowMapper<Todo> {
  public TodoRowMapper() {
  }

  public Todo mapRow(ResultSet resultSet, int arg1) throws SQLException {
    Todo todo = new Todo();
    todo.setId(resultSet.getInt("id"));
    todo.setName(resultSet.getString("name"));
    return todo;
  }
}
