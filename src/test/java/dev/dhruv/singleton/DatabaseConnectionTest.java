package dev.dhruv.singleton;

import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    @Test
    public void testSingletonConnection() {

        DatabaseConnection connOne = DatabaseConnection.getConnection();
        DatabaseConnection connTwo = DatabaseConnection.getConnection();

        assert connOne.hashCode() == connTwo.hashCode();
    }

}
