package Adventure Game Character System;

public class Mage extends GameCharacter {

    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " casts Fireball");
    }
}
