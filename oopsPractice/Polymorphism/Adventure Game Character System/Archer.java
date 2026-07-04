package Adventure Game Character System;
public class Archer extends GameCharacter {

    public Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " shoots Arrow");
    }
}
