package Mini_Test;

class Coffee extends Drink implements IMixable {
    protected boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        if (hasMilk) {
            return price + 5000;
        } else {
            return price;
        }
    }

    @Override
    public void mix() {
    }

    @Override
    public void displayInfo() {
        System.out.printf("Ma: %d | Ten: %s | Gia: %.2f | %s\n", id, name, price, hasMilk ? "Co sua" : "Den da");

    }
}
