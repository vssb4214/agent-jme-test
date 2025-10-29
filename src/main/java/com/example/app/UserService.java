package com.example.app;

public class UserService {
    private String[] users = {"Alice", "Bob", "Charlie"};
    
    public String getUserById(int id) {
        // Bug: NullPointerException - no null check
        return users[id].toUpperCase();
    }
    
    public void addUser(String name) {
        // This method is fine
        System.out.println("Adding user: " + name);
    }
}
