package org.mumufamily.todo.repository;

import org.mumufamily.todo.model.ToDoItem;
import org.testng.annotations.Test;
import org.testng.Assert;

@Test
public class InMemoryToDoRepositoryTest {
	public void testFindAll() {
		String t = "b";
		Assert.assertEquals(t, "b");
	}
}


