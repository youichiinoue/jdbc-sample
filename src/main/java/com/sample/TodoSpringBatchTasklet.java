package com.sample;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.sample.model.Todo;
import com.sample.model.TodoDao;

public class TodoSpringBatchTasklet implements Tasklet {
  @Autowired
  TodoDao todoDao;

  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    System.out.println("Hello!!!!");
    todoDao.createTodo(1, "ccc");
    todoDao.createTodo(2, "ccc");
    List<Todo> list = todoDao.getAll();
    System.out.println("abc" + list.size());
    return RepeatStatus.FINISHED;
  }
}
