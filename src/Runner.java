import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give num, me tired: ");
        int num = s.nextInt();
        CircularProblem hmmmmm = new CircularProblem(num);
        hmmmmm.onlyOdds();
    }
}
