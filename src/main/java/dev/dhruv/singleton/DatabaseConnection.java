package dev.dhruv.singleton;

public class DatabaseConnection {
    // static class
    private static final DatabaseConnection connection = new DatabaseConnection();

    private DatabaseConnection() {
        System.out.println("Database connection instantiated.");
    }

    public static DatabaseConnection getConnection() {
        return connection;
    }
}
