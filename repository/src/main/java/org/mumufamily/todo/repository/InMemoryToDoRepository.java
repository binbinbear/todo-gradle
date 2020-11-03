package org.mumufamily.todo.repository;

import org.mumufamily.todo.model.ToDoItem;
import java.util.List;
import java.util.ArrayList;

public class InMemoryToDoRepository implements ToDoRepository {
	@Override
	public List<ToDoItem> findAll() {
		List<ToDoItem> list = new ArrayList<>();
		ToDoItem item = new ToDoItem();
		item.id = 123l;
		item.name = "todoItem";
		list.add(item);
		return list;
	}
}
