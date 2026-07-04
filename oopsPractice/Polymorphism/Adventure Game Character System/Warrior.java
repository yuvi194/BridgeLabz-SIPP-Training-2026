package Adventure Game Character System;

public class Warrior extends GameCharacter {

    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Sword");
    }
}