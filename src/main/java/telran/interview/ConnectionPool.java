package telran.interview;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ConnectionPool {
    // TODO work out data structure
    // Connection pool comprises of some number of connections
    // It can not contains more than the predefined number of connections
    // You should define some connection Pool policy so that if number of
    // connections
    // is going to exceed the limit a connection should be removed from connection
    // pool
    // Policy should take in consideration the order of adding connections in pool
    // and using connections
    LinkedHashMap<String, Connection> connections;
    int size;

    public ConnectionPool(int size) {
        this.size = size;
        this.connections = new LinkedHashMap<>(size, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Connection> eldest) {
                return size() > size;
            }
        };
    }

    public void addConnection(Connection connection) {
        // TODO
        // if the connection already exist in the pool, the IllegalStateException should
        // be thrown
        if (connections.containsKey(connection.connectionID())) {
            throw new IllegalStateException();
        } else {}
            connections.put(connection.connectionID(), connection);
        }

    public Connection getConnection(String connectionID) {
        // TODO
        // should be return connection
        // if connection with a givenID doesn't not exist the NoSuchException should be
        // thrown
        Connection connection = connections.get(connectionID);
        if (connection == null) {
            throw new NoSuchElementException();
        }
        return connection;
    }
}
