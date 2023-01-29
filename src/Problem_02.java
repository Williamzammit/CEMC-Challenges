import java.util.ArrayList;
import java.util.Scanner;

public class Problem_02 {
    public void solveProblemTwo(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Team Size");
        int teamSize = input.nextInt();
        ArrayList<Integer> teamPoints = new ArrayList<Integer>();
        ArrayList<Integer> teamFouls = new ArrayList<Integer>();

        int goodPlayers = 0;
        String starTeam = "+";

        for(int i = 1; i <= teamSize; i++){
            System.out.println("Enter The Number of Points for player " + i);
            teamPoints.add(input.nextInt());

            System.out.println("Enter The Number of Fouls for player " + i);
            teamFouls.add(input.nextInt());
        }

        for(int i = 0; i < teamSize; i++){
            int p = teamPoints.get(i);
            int f = teamFouls.get(i);
            
            p *= 5;
            f *= 3;

            int totalRating = p - f;
            if(totalRating > 40){
                goodPlayers++;
            } else {
                starTeam = "";
            }
        }
        System.out.println(goodPlayers + starTeam);
      


    }
    
}
