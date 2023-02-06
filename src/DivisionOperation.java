import java.util.Scanner;

public class DivisionOperation {

    public static void division(){

        Scanner scanner = new Scanner(System.in);

        View.mathematicalProcess();
        View.firstOperation();
        int numberOne = scanner.nextInt();
        View.secondOperation();
        int numberTwo = scanner.nextInt();
        String mathematicalProcess =  "\tThe result of division is " +numberOne / numberTwo +"\n";
        System.out.println(mathematicalProcess);

    }

}
