import java.util.concurrent.atomic.AtomicInteger;

public class Commit {

    public static String description;
    private int uniqueId;
//    private String description;
    private CommitType commitType;

    private static AtomicInteger at = new AtomicInteger(1);

    private int getNextUniqueId() {
        return at.incrementAndGet();
    }

    public boolean createNewCommit(CommitType commitType, String description) {
        this.uniqueId = getNextUniqueId();
//        Commit commit = new Commit(newId, commitType, description);
        this.commitType = commitType;
        this.description = description;

        return true;
    }
}
