
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static String getResponse(String message) {
        String input = message.toLowerCase().trim();

        if (input.isEmpty()) {
            return "Please enter a message.";
        }

        if (input.equals("hi") || input.equals("hello")
                || input.equals("hey")) {
            return "Hello! Welcome to Java Chatbot. How can I help you?";
        }

        if (input.contains("your name")) {
            return "I am JavaBot, your virtual assistant.";
        }

        if (input.contains("artificial intelligence")
                || input.equals("ai")) {
            return "Artificial Intelligence enables computers to perform "
                    + "tasks that normally require human intelligence.";
        }

        if (input.contains("machine learning")) {
            return "Machine learning allows computers to learn patterns "
                    + "from data.";
        }

        if (input.contains("time")) {
            return "Your current system time is: "
                    + LocalTime.now().withNano(0);
        }

        if (input.contains("date")) {
            return "Today's date is: " + LocalDate.now();
        }

        if (input.contains("thank")) {
            return "You're welcome! Feel free to ask me another question.";
        }

        if (input.contains("help")) {
            return "You can ask about Java, AI, machine learning, "
                    + "time, or date.";
        }

        if (input.contains("java")) {
            return "Java is an object-oriented programming language "
                    + "used to build applications.";
        }

        return "Sorry, I don't know that yet. Type 'help' to see "
                + "what you can ask.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         JAVA AI CHATBOT");
        System.out.println("==================================");
        System.out.println("Hello! I am JavaBot.");
        System.out.println("Ask me a question.");
        System.out.println("Type 'exit' to stop chatting.");
        System.out.println("----------------------------------");

        while (true) {
            System.out.print("You: ");

            String message = sc.nextLine().trim();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println(
                        "JavaBot: Goodbye! Have a great day!");
                break;
            }

            if (message.isEmpty()) {
                System.out.println(
                        "JavaBot: Please enter a message.");
                continue;
            }

            System.out.println("JavaBot: " + getResponse(message));
            System.out.println("----------------------------------");
        }

        sc.close();
    }
}
