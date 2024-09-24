public class IdGenerator {
    private static int userIdCounter = 0;
    private static int messageIdCounter = 0;

    public static int generateUserId() {
        return ++userIdCounter;
    }

    public static int generateMessageId() {
        return ++messageIdCounter;
    }
}