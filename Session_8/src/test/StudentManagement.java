package test;

public class StudentManagement {
    private Student[] students;
    private int count;
    private final int MAX_SIZE = 100;

    public StudentManagement() {
        students = new Student[MAX_SIZE];
        count = 0;
    }

    public boolean addStudent(Student s) {
        if (count >= MAX_SIZE || findById(s.getId()) != null) return false;
        students[count++] = s;
        return true;
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("Danh sách sinh viên đang trống.");
            return;
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("| Mã SV    | Họ và Tên          | Tuổi | G.Tính   | Điểm TB | Xếp Loại   |");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public Student findById(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) return students[i];
        }
        return null;
    }

    public boolean deleteById(String id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--count] = null;
        return true;
    }

    public void sortByAverageDescending() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
