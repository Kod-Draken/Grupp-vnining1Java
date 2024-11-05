import java.util.concurrent.ThreadLocalRandom;

public class FighterGame {
    // maybe 1 more class for output
    Player player1 = new Player("Mattias");
    Player player2 = new Player("Emilia");

    public void play() {
        player1.setWeapon();
    
        player1.attack(player2);
        System.out.println("player 2 hp: " + player2.getHitPoints());
        player2.heal();
        System.out.println("player 2 hp: " + player2.getHitPoints());

        while(player1.getHitPoints() > 0 || player2.getHitPoints() > 0){
            round();
    
        }
    }

    private void round(){
        int whoStarts = ThreadLocalRandom.current().nextInt(0,1);
        if (whoStarts == 1) {
            player1.attack(player2);
            player2.attack(player1);
        }
    }

    private void playAgain(){
        System.out.println("Vill du spela igen? Y/N");
        play();
    }
}
