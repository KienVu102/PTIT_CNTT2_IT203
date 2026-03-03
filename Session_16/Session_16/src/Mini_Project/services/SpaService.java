package Mini_Project.services;

import java.util.ArrayDeque;
import java.util.Queue;
import Mini_Project.interfaces.ISpaService;
import Mini_Project.models.ServiceTicket;

public class SpaService implements ISpaService {
    private final Queue<ServiceTicket> serviceTickets = new ArrayDeque<>();

    @Override
    public ServiceTicket handlePet() {
        return serviceTickets.poll();
    }

    @Override
    public void takePet(ServiceTicket serviceTicket) {
        serviceTickets.add(serviceTicket);
        System.out.println("Tiep nhan thanh cong");
    }

}
