package main.java.com.example.base_crud.service;

import main.java.com.example.base_crud.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
	private final List<Task> tasks = new ArrayList<>();

	public TaskService() {
		tasks.add(new Task(1L, "Task 1", "Description for Task 1"));
		tasks.add(new Task(2L, "Task 2", "Description for Task 2"));
	}

	public List<Task> getAllTasks() {
		return tasks;
	}

	public Task createTask(Task task) {
		tasks.add(task);
		return task;
	}

	public Optional<Task> updateTask(Long id, Task updatedTask) {
		return tasks.stream()
			.filter(t -> t.getId().equals(id))
			.findFirst()
			.map(task -> {
				task.setTitle(updatedTask.getTitle());
				task.setDescription(updatedTask.getDescription());
				return task;
			});
	}

	public void deleteTask(Long id) {
		tasks.removeIf(t -> t.getId().equals(id));
	}
}