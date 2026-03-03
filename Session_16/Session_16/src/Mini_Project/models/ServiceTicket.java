package Mini_Project.models;

public class ServiceTicket {
    private String id;
    private String petId;
    private String customerId;
    private String serviceType;

    public ServiceTicket(String id, String petId, String customerId, String serviceType) {
        this.id = id;
        this.petId = petId;
        this.customerId = customerId;
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Ma ve: " + id +
                " | Ma thu cung: " + petId +
                " | Ma khach hang: " + customerId +
                " | Dich vu: " + serviceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
