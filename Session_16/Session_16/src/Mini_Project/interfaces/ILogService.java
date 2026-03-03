package Mini_Project.interfaces;

import java.util.Stack;

import Mini_Project.models.Log;

public interface ILogService {
    Stack<Log> getAll();

    void saveAction(Log log);

    Log undo();
}
