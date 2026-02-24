package Mini_Test;

class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bạc xỉu", 30000, true);
        drinks[1] = new FruitJuice(2, "Nước cam", 40000, 10);

        for (Drink drink : drinks) {
            if (drink != null) {
                drink.displayInfo();
                System.out.printf("Gia tien: %.2f\n", drink.calculatePrice());
                if (drink instanceof FruitJuice) {
                    ((FruitJuice) drink).mix();
                }
            }
        }
    }
}
