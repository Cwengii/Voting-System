import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        String[] candidates = {"Alice", "Bob", "Charlie"};
        int[] votes = new int[candidates.length];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Voting System");
        while (true) {
            System.out.println("Enter your vote (1: Alice, 2: Bob, 3: Charlie, 0 to exit):");
            int choice = scanner.nextInt();

            if (choice == 0) break;
            if (choice >= 1 && choice <= candidates.length) {
                votes[choice - 1]++;
                System.out.println("Vote cast successfully!");
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

        System.out.println("\nVoting Results:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + ": " + votes[i] + " votes");
        }
        scanner.close();
    }
}