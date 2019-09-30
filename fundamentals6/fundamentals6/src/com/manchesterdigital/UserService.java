package com.manchesterdigital;

// Find a user in a database and then return that user
public class UserService {

    // Arranging dummy data, faking a user in the database

    private static User user;

    // Before user is created, the actions inside this static block are completed
    // This is like creating fake JSON in JS for testing instead of connecting to a database
    static {
        user = new User("April");
        user.setId(1L);
    }

    // Find user with Id that's passed to the method, then return the user
    public User retrieveUser(Long id) {

        // If we can't find a user with the ID that's been passed to the method, throw an error
        if (!id.equals(user.getId())) {
            throw new UserNotFoundException("No user found with the ID of: " + id);
        }

        // If we can find the user, return it
        return user;
    }

    public static void main(String[] args) {
        UserService userService = new UserService();

        // The maximum value that a long can be
        User retrievedUser = userService.retrieveUser(1L);
        System.out.println(retrievedUser.toString());
    }
}
