package telran.interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterviewTasksTest {
    @Test
    void hasSumTwoTest() {
        int[] array = {1, 2, 3, 4};
        assertTrue(InterviewTasks.hasSumTwo(array, 7));
        assertFalse(InterviewTasks.hasSumTwo(array, 100));
    }
    @Test
    void hasSumTwoTest2() {
        int[] array = {3, 7, 8, 10};
        assertTrue(InterviewTasks.hasSumTwo2(array, 10));
        assertFalse(InterviewTasks.hasSumTwo2(array, 6));
    }
}