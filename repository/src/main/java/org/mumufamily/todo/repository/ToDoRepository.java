package org.mumufamily.todo.repository;

import org.mumufamily.todo.model.ToDoItem;
import java.util.Collection;
import java.util.List;

public interface ToDoRepository {
	List<ToDoItem> findAll();
}
