package Mini_Project.interfaces;

import Mini_Project.models.Customer;

public interface IUserService {
    Customer findByPhone(String phone);
}
