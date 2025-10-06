import java.util.Scanner;

public class StudentScoreAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[count];
        int[] scores = new int[count];

        // Input student names and scores
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter score of " + names[i] + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline
        }

        // Calculate total, average, highest, and lowest
        int total = 0, highest = scores[0], lowest = scores[0];
        String topStudent = names[0], bottomStudent = names[0];

        for (int i = 0; i < count; i++) {
            total += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
                topStudent = names[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
                bottomStudent = names[i];
            }
        }

        double average = (double) total / count;

        // Output the results
        System.out.println("\n--- Student Score Report ---");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }

        System.out.println("\nTotal Score: " + total);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highest + " (" + topStudent + ")");
        System.out.println("Lowest Score: " + lowest + " (" + bottomStudent + ")");

        scanner.close();
    }
}
