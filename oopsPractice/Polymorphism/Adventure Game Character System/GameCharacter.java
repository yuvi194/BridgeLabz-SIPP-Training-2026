package Adventure Game Character System;

ppublic class GameCharacter {

    protected String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println("Character attacks");
    }
}