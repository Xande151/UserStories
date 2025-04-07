import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;


//JUnit tests for the deleteTask.
public class TaskManagerTest {

	//test if a task is successfully deleted
	@Test
	public void testDeleteExistingTask() {
		TaskManager manager = new TaskManager();
		Task task = new Task("1", "Test Task", "Some details");
		manager.addTask(task);

		//verify that the task exists before deletion.
		assertTrue(manager.taskExists("1"));

		//delete the task and assert deletion was successful.
		boolean deleted = manager.deleteTask("1");
		assertTrue(deleted);

		//verify that the task no longer exists after deletion.
		assertFalse(manager.taskExists("1"));
	}

	//test if the task no longer exists after deletion.
	@Test
	public void testTaskNoLongerExistsAfterDeletion() {
		TaskManager manager = new TaskManager();
		Task task = new Task("2", "Another Task", "Additional details");
		manager.addTask(task);

		//delete the task.
		manager.deleteTask("2");

		//assert that the task is no longer present.
		assertFalse(manager.taskExists("2"));
	}

	//test deletion of a non-existent task and handling error
	@Test
	public void testDeleteNonExistentTask() {
		TaskManager manager = new TaskManager();

		//attempt to delete a task that does not exist.
		boolean result = manager.deleteTask("nonexistent");
		assertFalse(result);
	}
}

//Task class for representing a single task
class Task {
	private String id;
	private String title;
	private String details;

	public Task(String id, String title, String details) {
		this.id = id;
		this.title = title;
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDetails() {
		return details;
	}
}

//TaskManager class for managing tasks.
class TaskManager {
	private Map<String, Task> tasks;

	public TaskManager() {
		tasks = new HashMap<>();
	}

	public void addTask(Task task) {
		tasks.put(task.getId(), task);
	}

	public boolean deleteTask(String taskId) {
		if (tasks.containsKey(taskId)) {
			tasks.remove(taskId);
			return true;
		} else {
			return false;
		}
	}

	public boolean taskExists(String taskId) {
		return tasks.containsKey(taskId);
	}

	public int getTaskCount() {
		return tasks.size();
	}
}
