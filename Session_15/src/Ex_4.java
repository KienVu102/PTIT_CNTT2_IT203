import java.util.PriorityQueue;
import java.util.Queue;

public class Ex_4 {

    static class EmergencyPatient {
        private String id;
        private String name;
        private int priority;
        private long order;

        public EmergencyPatient(String id, String name, int priority, long order) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.order = order;
        }

        public int getPriority() {
            return priority;
        }

        public long getOrder() {
            return order;
        }

        @Override
        public String toString() {
            String level = (priority == 1) ? "EMERGENCY" : "NORMAL";
            return "Patient{id='" + id + "', name='" + name + "', level=" + level + "}";
        }
    }

    static class EmergencyQueue {
        private Queue<EmergencyPatient> queue;
        private long counter = 0;

        public EmergencyQueue() {
            queue = new PriorityQueue<>(
                    (p1, p2) -> {
                        if (p1.getPriority() != p2.getPriority()) {
                            return p1.getPriority() - p2.getPriority(); // priority truoc
                        }
                        return Long.compare(p1.getOrder(), p2.getOrder()); // FIFO
                    });
        }

        public void addPatient(String id, String name, int priority) {
            EmergencyPatient p = new EmergencyPatient(id, name, priority, counter++);
            queue.offer(p);
            System.out.println("Add patient: " + p);
        }

        public EmergencyPatient callNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("No patient to call");
                return null;
            }
            EmergencyPatient p = queue.poll();
            System.out.println("Call patient: " + p);
            return p;
        }

        public void displayQueue() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Current waiting list:");
            for (EmergencyPatient p : queue) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        EmergencyQueue emergencyQueue = new EmergencyQueue();

        emergencyQueue.addPatient("BN01", "Nguyen Van A", 2);
        emergencyQueue.addPatient("BN02", "Tran Thi B", 1);
        emergencyQueue.addPatient("BN03", "Le Van C", 2);
        emergencyQueue.addPatient("BN04", "Pham Van D", 1);

        System.out.println();
        emergencyQueue.displayQueue();

        System.out.println();
        emergencyQueue.callNextPatient();
        emergencyQueue.callNextPatient();

        System.out.println();
        emergencyQueue.displayQueue();
    }
}