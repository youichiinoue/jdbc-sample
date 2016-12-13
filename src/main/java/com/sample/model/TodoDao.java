package com.sample.model;

import com.sample.model.Todo;
import java.util.List;

public abstract interface TodoDao {
  public abstract void createTodo(int id, String name);
  public abstract List<Todo> getAll();
}
