import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int scoreCompare = Integer.compare(b.getScore(), a.getScore());
        int nameCompare = a.getName().compareTo(b.getName());
        return scoreCompare == 0? nameCompare : scoreCompare;
    }
}
