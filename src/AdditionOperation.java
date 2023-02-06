import java.util.Scanner;

public class AdditionOperation {

    public static void addition(){

        Scanner scanner = new Scanner(System.in);
        View.additionProcess();
        View.firstOperation();
        int numberOne = scanner.nextInt();
        View.secondOperation();
        int numberTwo = scanner.nextInt();

        String additionProcess = "\t The result of addition is  " + (numberOne + numberTwo)  +"\n";
        System.out.println(additionProcess);

    }
}
