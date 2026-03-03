package Mini_Project.services;

import java.util.ArrayList;
import java.util.List;
import Mini_Project.interfaces.IManager;
import Mini_Project.models.Pet;

public class PetService implements IManager<Pet> {
    private final List<Pet> pets = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return pets.isEmpty();
    }

    @Override
    public void add(Pet t) {
        if (findById(t.getId()) != null) {
            System.out.println("Them that bai, ID da ton tai");
            return;
        }
        pets.add(t);
        System.out.println("Them thanh cong");
    }

    @Override
    public void displayAll() {
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }

    @Override
    public Pet findById(String id) {
        for (Pet pet : pets) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public void remove(Pet t) {
        pets.remove(t);
        System.out.println("Xoa thanh cong");
    }

    @Override
    public void update(Pet t) {
        System.out.println("Cap nhat thanh cong");
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getId().equals(t.getId())) {
                pets.remove(i);
                pets.add(i, t);
                break;
            }
        }
    }

}
