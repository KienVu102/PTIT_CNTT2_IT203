package Mini_Project;

public class Main {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Yasuo", 500, 50, 20);
        characters[1] = new Mage("Veigar", 300, 40, 200);
        characters[2] = new GameCharacter("Goblin", 100, 10) {
            @Override
            void attack(GameCharacter target) {
                System.out.printf("%s can trom %s gay %.2f sat thuong\n", this.name, target.name, attackPower);
                target.takeDamage(attackPower);
            }

            @Override
            void displayInfo() {
                System.out.printf("Ten: %s | HP: %.2f", name, hp);
            }
        };

        for (int i = 0; i < 3; i++) {
            if (characters[i].hp == 0) {
                continue;
            }

            for (int j = 1; j < characters.length; j++) {

            }
        }

        System.out.println("\nTong so nhan vat da tao: " + GameCharacter.count + "\n");
        System.out.println("----- Thong so sau luot dau -----");
        for (GameCharacter gameCharacter : characters) {
            gameCharacter.displayInfo();
        }
    }
}
