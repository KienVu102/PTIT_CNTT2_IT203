package Mini_Test;

class FruitJuice extends Drink implements IMixable {
    protected int discountPercent;

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi");
    }
}
