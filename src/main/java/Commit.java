import java.util.concurrent.atomic.AtomicInteger;

public class Commit {

    private int uniqueId;
    private String description;
    private CommitType commitType;

    private static AtomicInteger at = new AtomicInteger(1);

    private int getNextUniqueId() {
        return at.incrementAndGet();
    }

    public boolean createNewCommit(CommitType commitType, String description) {

    }
}
