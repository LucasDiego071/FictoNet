import java.util.ArrayList;
import java.util.List;

public class Messages {
    int id;
    String text;
    int authorId;
    List<Reacao> reactions = new ArrayList<>();

    public Messages(String text, int authorId) {
        this.text = text;
        this.authorId = authorId;
        this.id = IdGenerator.generateMessageId();
    }

    void addReactions(String react) {
        for (Reacao reaction : reactions) {
            if (reaction.matchesReaction(react)) {
                reaction.incrementCount();
                return;
            }
        }
        reactions.add(new Reacao(react));
    }

    void showReactions() {
        for (Reacao reaction : reactions) {
            System.out.println("Reação: " + reaction.getReactionType() + ", Contagem: " + reaction.getCount());
        }
    }
}