public class Player {
    private String name;
    private int highscore;
    private int roundCounter;
    private int hitPoints;

    public Player(String name){
        this.name = name;
        this.highscore = 0;
        this.roundCounter = 0;
    }

    public void wound(int damage){
        this.hitPoints -= damage;
    }
}