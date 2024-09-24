import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    int id;
    String name;
    int age;
    List<Messages> messages = new ArrayList<>();

    User(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = IdGenerator.generateUserId();
    }

    public Messages createMessage(Scanner scanner) {
        System.out.print("Digite sua mensagem: ");
        String text = scanner.nextLine();
        Messages newMessage = new Messages(text, this.id);
        messages.add(newMessage);
        System.out.println("Mensagem criada com sucesso!");
        return newMessage;
    }

    public void showMessages() {
        if (messages.isEmpty()) {
            System.out.println("Este usuário não tem mensagens.");
            return;
        }
        for (Messages message : messages) {
            System.out.println("ID: " + message.id + ", Texto: " + message.text);
            message.showReactions();
            System.out.println();
        }
    }
}
