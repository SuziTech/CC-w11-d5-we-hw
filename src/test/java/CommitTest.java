import org.junit.Before;
import org.junit.Test;

public class CommitTest {

    Commit commit;

    @Before
    public void setup() {
        commit = new Commit.commit(CommitType.FEAT,
                Commit.description = "First feature commit");
    }

//    @Test



}
