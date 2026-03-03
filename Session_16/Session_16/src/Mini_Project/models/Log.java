package Mini_Project.models;

public class Log {

    private String actionType;
    private Object data;

    public Log(String actionType, Object data) {
        this.actionType = actionType;
        this.data = data;
    }

    public String getActionType() {
        return actionType;
    }

    public Object getData() {
        return data;
    }
}
