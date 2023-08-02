package Game.Monsters;

import Game.Monster;
import Game.Interfaces.Bleedable;
import Game.Interfaces.Poisonable;

public class Troll extends Monster implements Bleedable, Poisonable {
    private boolean isBleedable, isPoisonable;

    public Troll(String name, int hitPoints, double damage, boolean isBleedable, boolean isPoisonable) {
        super(name, hitPoints, damage);
        this.isBleedable = isBleedable;
        this.isPoisonable = isPoisonable;
    }

    @Override
    public double bleed() {
        return isBleedable ? getDamage() * 0.4 : 0;
    }

    @Override
    public double poison() {
        return isPoisonable ? getDamage() * 0.1 : 0;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}