package Game;

import java.util.Random;
import Game.Monsters.Orc;
import Game.Monsters.Troll;
import Game.Monsters.UrukHai;

public class Game {

    private static void runApp() {
        Monster[] monsters = new Monster[3];
        monsters[0] = new UrukHai("Uruk Hai", 400, new Random().nextInt((35 - 15) + 1) + 15,
                new Random().nextBoolean(), new Random().nextBoolean());
        monsters[1] = new Troll("Troll", 2000, new Random().nextInt((45 - 25) + 1) + 25, new Random().nextBoolean(),
                new Random().nextBoolean());
        monsters[2] = new Orc("Orc", 150, new Random().nextInt((20 - 5) + 1) + 5, new Random().nextBoolean(),
                new Random().nextBoolean());

        for (Monster monster : monsters) {
            System.out.println("--------------------");
            System.out.println(monster.getName() + " have " + monster.getHitPoints() + " hit points.");
            System.out.println(monster.getName() + " attacks with " + monster.attack() + " damage.");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        runApp();
    }
}
