import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private String name;
    private int highscore;
    private int roundCounter;
    private int hitPoints;
    private Weapon weapon;

    public Player(String name){
        this.name = name;
        this.highscore = 0;
        this.roundCounter = 0;
        this.hitPoints = 25;
    }

    public void setWeapon(){
        this.weapon = Weapon.SWORD;
    }

    public void wound(int damage){
        this.hitPoints -= damage;
    }

    public void heal(){
        this.hitPoints += ThreadLocalRandom.current().nextInt(0, 6) + 1;
    }

    public void attack(Player target){
        target.wound(ThreadLocalRandom.current().nextInt(0, 10) + 1);
    }

    public String getName() {
        return name;
    }

    public int getHighscore() {
        return highscore;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    
}