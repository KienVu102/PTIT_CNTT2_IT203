package Mini_Test;

import java.util.*;

public class ProductRepository implements IRepository<Product> {
    private List<Product> list = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || map.containsKey(item.getId())) {
            return false;
        }
        list.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = map.remove(id);
        if (p != null) {
            return list.remove(p);
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list);
    }
}
