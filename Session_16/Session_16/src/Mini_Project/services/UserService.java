package Mini_Project.services;

import java.util.HashMap;
import java.util.Map;
import Mini_Project.interfaces.IManager;
import Mini_Project.interfaces.IUserService;
import Mini_Project.models.Customer;

public class UserService implements IUserService, IManager<Customer> {
    private final Map<String, Customer> customers = new HashMap<>();

    @Override
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    @Override
    public void add(Customer t) {
        if (customers.containsKey(t.getId())) {
            System.out.println("Them that bai, ID da ton tai");
            return;
        }
        customers.put(t.getId(), t);
        System.out.println("Them khach hang thanh cong");
    }

    @Override
    public void displayAll() {
        for (Map.Entry<String, Customer> entry : customers.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    @Override
    public Customer findById(String id) {
        for (Map.Entry<String, Customer> entry : customers.entrySet()) {
            if (entry.getKey().equals(id)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void remove(Customer t) {
        customers.remove(t.getId());
        System.out.println("Xoa thanh cong");
    }

    @Override
    public void update(Customer t) {
        if (customers.containsKey(t.getId())) {
            customers.put(t.getId(), t);
        }
        System.out.println("Cap nhat thanh cong");
    }

    @Override
    public Customer findByPhone(String phone) {
        for (Map.Entry<String, Customer> entry : customers.entrySet()) {
            if (entry.getValue().getPhone().equals(phone)) {
                return entry.getValue();
            }
        }
        return null;
    }

}
