package org.excelr.day3.time_complexity;

public class WebsiteSimulation {
    // Simulated website with arrays of usernames and emails
    private String[] usernames = {"user1", "user2", "user3"};
    private String[] emails = {"user1@example.com", "user2@example.com", "user3@example.com"};

    // Simulated search function with linear time complexity O(n)
    public String findUserByEmail(String targetUsername) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(targetUsername)) {
                return emails[i];
            }
        }
        return null; // User not found
    }

    // Main method to demonstrate the simulation
    public static void main(String[] args) {
        WebsiteSimulation website = new WebsiteSimulation();

        // Simulate a search operation
        String targetUsername = "user2";
        String linearSearchResult = website.findUserByEmail(targetUsername);

        // Print the result
        if (linearSearchResult != null) {
            System.out.println("Linear Search Result: User found - " + linearSearchResult);
        } else {
            System.out.println("Linear Search Result: User not found");
        }
    }
}
