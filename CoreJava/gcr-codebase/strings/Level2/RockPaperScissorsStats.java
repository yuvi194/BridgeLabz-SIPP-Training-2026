import java.util.*;
public class RockPaperScissorsStats {
    public static String computerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0)
            return "Rock";
        else if (random == 1)
            return "Paper";
        else
            return "Scissors";
    }
    public static String findWinner(String user,String computer) {
        if (user.equals(computer))
            return "Draw";
        if ((user.equals("Rock")&& computer.equals("Scissors"))|| (user.equals("Paper")&& computer.equals("Rock"))|| (user.equals("Scissors")&& computer.equals("Paper"))) {
            return "Player";
        }
        return "Computer";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 1; i <= games; i++) {
            System.out.print("\nEnter Rock/Paper/Scissors: ");
            String player = sc.next();
            String computer = computerChoice();
            String winner =findWinner(player,computer);
            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
            System.out.println(i + "\t" + player + "\t" + computer + "\t"+ winner);
        }
        double playerPercent =(playerWins * 100.0) / games;
        double computerPercent =(computerWins * 100.0) / games;
        System.out.println("\nPlayer Wins = "+ playerWins);
        System.out.println("Computer Wins = "+ computerWins);
        System.out.println("Player Win % = "+ playerPercent);
        System.out.println("Computer Win % = "+ computerPercent);
        sc.close();
    }
}