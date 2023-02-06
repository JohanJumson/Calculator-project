import java.util.Scanner;

public class SubtractionOperation {

    public static void subtraction(){

        View view = new View();

        Scanner scanner = new Scanner(System.in);

        view.subtractionProcess();

        view.firstOperation();
        int numberOne = scanner.nextInt();

        view.secondOperation();
        int numberTwo = scanner.nextInt();


        String subtractionProcess = "\t The result of subtraction is  " + (numberOne - numberTwo) + "\n";
        System.out.println(subtractionProcess);

    }
}
