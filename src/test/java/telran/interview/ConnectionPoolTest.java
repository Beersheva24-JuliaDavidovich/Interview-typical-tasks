package telran.interview;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;;

public class ConnectionPoolTest {
    // TODo
    // should contain the tests reflecting your understanding what should be done
    Integer[] numbersOfConnection = {};
    LinkedHashMap<String, Integer> map;
    ConnectionPool pool = new ConnectionPool(3);
        Connection connection1 = new Connection("Connection1");
        Connection connection2 = new Connection("Connection2");
        Connection connection3 = new Connection("Connection3");
        Connection connection4 = new Connection("Connection4");

    @Test
    void addConnectionTest() {
        
        pool.addConnection(connection1);
        pool.addConnection(connection2);
        pool.addConnection(connection3);
        pool.addConnection(connection4);
        assertThrows(IllegalStateException.class, () -> pool.getConnection("Connection3"));
    }

    @Test
    void getConnectionTest() {
        pool.addConnection(connection1);
        assertEquals(connection2, pool.getConnection("Connection2"));
        assertThrows(NoSuchElementException.class, () -> pool.getConnection("Connection3"));
    }
}
