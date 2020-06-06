import java.util.Random;

public class Die {
    Random rand = new Random();
    static private int count = 0;
    private int id;
    private int sides;
    protected int totalRolls;

    public Die() {
        this.sides = 6;
        this.id = count++;
        this. totalRolls = 0;
    }

    public Die(int n) {
        this.sides = n;
        id= count++;
    }

    public int getSides() {
        return this.sides;
    }

    public int getID() {
        return this.id;
    }

    public int getTotalRolls(){
        return this.totalRolls;
    }
    public int roll() {
        totalRolls++;
        Random rand = null;
        int min = 1;
        int max = this.sides;
        int randomNum = this.rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
