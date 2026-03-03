package Mini_Project.services;

import java.util.Stack;
import Mini_Project.interfaces.ILogService;
import Mini_Project.models.Log;

public class LogService implements ILogService {

    private final Stack<Log> logs = new Stack<>();

    @Override
    public Stack<Log> getAll() {
        return logs;
    }

    @Override
    public void saveAction(Log log) {
        logs.push(log);
    }

    @Override
    public Log undo() {

        if (logs.isEmpty()) {
            System.out.println("Khong co hanh dong nao de undo");
            return null;
        }

        return logs.pop();
    }

    public boolean isEmpty() {
        return logs.isEmpty();
    }
}
