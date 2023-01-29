import java.util.Scanner;

public class Problem_01 {
        public void solveProblemOne(){

            Scanner input = new Scanner(System.in);

            int classSize = 28;
            System.out.println("ENTER R:");
            int r = input.nextInt();
            System.out.println("ENTER S:");
            int s = input.nextInt();

            int cupcakes = (r*8) + (s*3);

            System.out.println("Cupcakes left =\n" + (cupcakes-classSize));

        }
}
