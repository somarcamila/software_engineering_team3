import java.util.Random;

public class CheatingDie extends Die{
    int favor;
    public CheatingDie() {
        this.favor = this.getSides();
    }

    public int roll() {
        this.totalRolls++;
        if (this.rand.nextInt(2) == 1){
            return 99;
        }

        Random rand = null;
        int min = 1;
        int max = this.getSides();
        int randomNum = this.rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}

