package john.study.p2w;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecuteServiceManager {
    ScheduledExecutorService se = Executors.newScheduledThreadPool(20);

    public ScheduledExecutorService getSe() {
        return se;
    }
}
