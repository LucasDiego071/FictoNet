import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedeSocial {
    List<User> users = new ArrayList<>();
    List<Messages> allMessages = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void run() {
        while (true) {
            System.out.println("\n1. Criar usuário");
            System.out.println("2. Listar todos os usuários");
            System.out.println("3. Criar mensagem");
            System.out.println("4. Reagir a uma mensagem");
            System.out.println("5. Mostrar todas as mensagens");
            System.out.println("6. Mostrar mensagens de um usuário");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    listAllUsers();
                    break;
                case 3:
                    createMessage();
                    break;
                case 4:
                    reactToMessage();
                    break;
                case 5:
                    showAllMessages();
                    break;
                case 6:
                    showUserMessages();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


    void createUser() {
        System.out.print("Insira o nome do Usuário: ");
        String nomeUser = scanner.nextLine();

        System.out.print("Insira a idade do Usuário: ");
        int idadeUser = scanner.nextInt();
        scanner.nextLine();

        User usuario = new User(nomeUser, idadeUser);
        users.add(usuario);
        System.out.println("Usuário criado com sucesso! ID: " + usuario.id);
    }

    void createMessage() {
        if (users.isEmpty()) {
            System.out.println("Não há usuários cadastrados. Crie um usuário primeiro.");
            return;
        }

        System.out.print("ID do usuário que está postando a mensagem: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        User user = findUserById(userId);
        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        Messages newMessage = user.createMessage(scanner);
        allMessages.add(newMessage);
    }

    void reactToMessage() {
        if (allMessages.isEmpty()) {
            System.out.println("Não há mensagens para reagir.");
            return;
        }

        System.out.print("ID da mensagem para reagir: ");
        int messageId = scanner.nextInt();
        scanner.nextLine();

        Messages message = findMessageById(messageId);
        if (message == null) {
            System.out.println("Mensagem não encontrada.");
            return;
        }

        System.out.print("Digite sua reação (love/like/sad/angry/laugh): ");
        String reaction = scanner.nextLine().toLowerCase();
        message.addReactions(reaction);
        System.out.println("Reação adicionada com sucesso!");
    }

    void showAllMessages() {
        if (allMessages.isEmpty()) {
            System.out.println("Não há mensagens para mostrar.");
            return;
        }

        for (Messages message : allMessages) {
            User author = findUserById(message.authorId);
            System.out.println("ID: " + message.id + ", Autor: " + (author != null ? author.name : "Desconhecido") + ", Texto: " + message.text);
            message.showReactions();
            System.out.println();
        }
    }

    void showUserMessages() {
        System.out.print("Digite o ID do usuário: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        User user = findUserById(userId);
        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        user.showMessages();
    }

    User findUserById(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    Messages findMessageById(int id) {
        for (Messages message : allMessages) {
            if (message.id == id) {
                return message;
            }
        }
        return null;
    }

    void listAllUsers() {
        if (users.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
            return;
        }

        System.out.println("\nLista de todos os usuários:");
        for (User user : users) {
            System.out.println("ID: " + user.id + ", Nome: " + user.name + ", Idade: " + user.age);
        }
    }
}


