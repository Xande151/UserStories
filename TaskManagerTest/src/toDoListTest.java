
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    private ToDoList todo;

    @BeforeEach
    public void setUp() {
        todo = new ToDoList();
    }

    //Test that a task is successfully added
    @Test
    public void testTaskIsSuccessfullyAdded() {
        Task task = new Task("1", "Laundry", "Wash clothes");
        todo.addTask(task);
        assertTrue(todo.getTasks().contains(task));
    }

    // Test that task count increases after adding
    @Test
    public void testTaskCountIncreasesAfterAdding() {
        int before = todo.getTasks().size();
        todo.addTask(new Task("2", "Study", "Read chapter 5"));
        assertEquals(before + 1, todo.getTasks().size());
    }

    //Test that task has correct title and details
    @Test
    public void testTaskHasCorrectTitleAndDetails() {
        Task task = new Task("3", "Exercise", "Run 3 miles");
        todo.addTask(task);
        Task added = todo.getTasks().get(0);
        assertEquals("Exercise", added.getTitle());
        assertEquals("Run 3 miles", added.getDetails());
    }
}
