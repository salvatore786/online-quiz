import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizSystem quizSystem = new QuizSystem();

        while (true) {
            System.out.println("Computer Science Quiz System Menu:");
            System.out.println("1. Take CS Quiz");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    quizSystem.takeCSQuiz();
                    break;
                case 2:
                    quizSystem.viewScore();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static class QuizSystem {
        private int score;

        public void takeCSQuiz() {
            // Simulated CS quiz questions and answers
            String[] questions = {
                    "What is the difference between stack and queue?",
                    "What is a neural network?",
                    "Which IoT protocol is widely used for low-power, low-bandwidth devices?",
                    "What is the time complexity of binary search?",
                    "What is a binary tree?",
                    "What is the role of a pointer in data structures?"
            };
            String[] answers = {
                    "Stack follows LIFO (Last In First Out) while queue follows FIFO (First In First Out)",
                    "A neural network is a series of algorithms that attempt to recognize underlying relationships in a set of data through a process that mimics the way the human brain operates.",
                    "MQTT (Message Queuing Telemetry Transport)",
                    "O(log n)",
                    "A binary tree is a tree data structure in which each node has at most two children, referred to as the left child and the right child.",
                    "A pointer is a variable that stores the memory address of another variable."
            };

            score = 0;
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i]);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + answers[i]);
                }
            }

            System.out.println("CS Quiz completed. Your score: " + score);
        }

        public void viewScore() {
            System.out.println("Your current CS quiz score: " + score);
        }
    }
}
