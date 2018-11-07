import java.util.Scanner;
public class newstreak {

    public static void main(String[] args) {

        Scanner keyin=new Scanner(System.in);

        String pname,ppname,gname,input,season,seasonname;          // pname: player 1, ppname: player 2

        String yes = "yes";
        String no= "no";
        String FQ = "FQ";
        String Q = "Q";

        int FQ1;
        int Q1;

        System.out.println("Welcome to CJ STREAK!");
        System.out.println("\n CJ STREAK is a new way to keep a winning streak going. They're two types of streaks, a FQ-streak and a Q-streak. ");
        System.out.println(" A FQ-streak stands for: FULLY QUALIFIED STREAK. A Q-streak stands for: QUALIFIED STREAK. A FQ can only exists from 2");
        System.out.println(" or more wins in a row. If a FQ player loses a game, his FQ demotes to Q. A Q can only exist after losing one game,");
        System.out.println(" however if that player loses another game on top of the first. He then loses his streak and is back at zero wins.");
        System.out.println(" Holding a FQ allows you to create a SEASON. To do this the player must hold a FQ streak and cash in all their wins");
        System.out.println(" example: SEASON BAR NAME: THE SEASON OF CAMERONS NEVER ENDING TILT! BAR 5. Now a bar has been set and the only way to");
        System.out.println(" destroy the season is by winning more games than the amount of wins cashed for the season. so six wins would be needed");
        System.out.println(" to break THE SEASON OF CAMERONS NEVER ENDING TILT!");

        System.out.println("\nEnter player 1 name.");
        pname = keyin.next();

        System.out.println("Enter player 2 name.");
        ppname = keyin.next();

        System.out.println("Enter game name.");
        gname = keyin.next();

        System.out.println("Do you have a (FQ) or (Q) streak.");
        input = keyin.next();


        if(input.equals(FQ)){
            System.out.println("Enter number of wins.");
            FQ1 = keyin.nextInt();

            System.out.println("Would you like to create a season?");
            season = keyin.next();

            if (season.equalsIgnoreCase(yes)){
                System.out.println("You are now cashing in your FQ streak to create a season.");
                System.out.println("\nName your season!");
                seasonname = keyin.nextLine();
                seasonname += keyin.nextLine();
                System.out.println("Congratulations you've now created the season of " + seasonname + " at bar " +FQ1);

            }else if (season.equalsIgnoreCase(no)){
                System.out.println("Your streak continues good luck!");
            }
        }else if(input.equals(Q)) {
            System.out.println("Enter number of wins.");
            Q1 = keyin.nextInt();

            System.out.println("You can't do anything! Good luck with your next match!");
        }
   }
}
