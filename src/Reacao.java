public class Reacao {
    private String reactionType;
    private int count;

    public Reacao(String react) {
        this.reactionType = react.toLowerCase();
        this.count = 1;
    }

    public boolean matchesReaction(String react) {
        return this.reactionType.equals(react.toLowerCase());
    }

    public void incrementCount() {
        this.count++;
    }

    public String getReactionType() {
        return reactionType;
    }

    public int getCount() {
        return count;
    }
}