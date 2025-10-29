package com.example.app;

public class UserService {
    private String[] users = {"Alice", "Bob", "Charlie"};
    
    public String getUserById(int id) {
        // Bug: NullPointerException - no null check
Here is the fixed line of code for the `NullPointerException`:
```
return users[id].toString();
```
By calling `toString()` on the `users` array, we avoid the possibility of a `NullPointerException` when `users[id]` is null.
    }
    
    public void addUser(String name) {
        // This method is fine
        System.out.println("Adding user: " + name);
    }
}