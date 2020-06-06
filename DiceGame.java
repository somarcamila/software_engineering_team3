public class DiceGame {

public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Create a single Die
    Die d = new Die();
    int value = d.roll();
    int id = d.getID();
    System.out.println("ID: " + id + " :::Roll Value: " + value);

    // Array of 10 Dice
    Die[] dice = new Die[10];
    for (int i = 0; i<10; i++) {
        dice[i] = new Die();
    }
    System.out.println("10 Dice Array: ");

    for (int i = 0; i<10; i++) {
        id = dice[i].getID();
        int roll = dice[i].roll();
        System.out.println("ID: " + id + " :::Roll Value: " + roll);
    }

    System.out.println("10 Dice Array # 2: ");
    Die[] dice2 = new Die[10];
    for (int i = 0; i<10; i++) {
        dice2[i] = new Die();
    }

    for (int i = 0; i<10; i++) {
        id = dice2[i].getID();
        int roll = dice2[i].roll();
        System.out.println("ID: " + id + " :::Roll Value: " + roll);
    }

    Die[] dice3 = new CheatingDie[10];
    System.out.println("Cheating dice: ");
    for (int i = 0; i<10; i++) {
        dice3[i] = new CheatingDie();
    }

    for (int i = 0; i<10; i++) {
        id = dice3[i].getID();
        int roll = dice3[i].roll();
        for (int j =0; j< i; j++){
            dice3[i].roll();
        }
        int total = dice3[i].getTotalRolls();
        System.out.println("ID: " + id + " :::Roll Value: " + roll
        + " ::: Total Rolls: " + total);
    }
}

}


