import java.util.Scanner;

public class SubtractionOperation {

    public static void subtraction(){

        Scanner scanner = new Scanner(System.in);
        View.subtractionProcess();
        View.firstOperation();
        int numberOne = scanner.nextInt();
        View.secondOperation();
        int numberTwo = scanner.nextInt();

        String subtractionProcess = "\t The result of subtraction is  " + (numberOne - numberTwo) + "\n";
        System.out.println(subtractionProcess);

    }
}
