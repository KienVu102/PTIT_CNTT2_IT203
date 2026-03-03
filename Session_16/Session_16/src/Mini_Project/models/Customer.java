package Mini_Project.models;

public class Customer {
    private String id;
    private String fullName;
    private String phone;

    public Customer(String id, String fullName, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + "Ho ten:" + fullName + " | " + "So dien thoai: " + phone;
    }

}
