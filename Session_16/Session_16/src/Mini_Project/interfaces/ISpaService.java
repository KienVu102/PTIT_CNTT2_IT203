package Mini_Project.interfaces;

import Mini_Project.models.ServiceTicket;

public interface ISpaService {
    void takePet(ServiceTicket serviceTicket);

    ServiceTicket handlePet();
}
