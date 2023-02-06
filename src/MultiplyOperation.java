import java.util.Scanner;

public class MultiplyOperation {

    public static void multiply(){

        Scanner scanner = new Scanner(System.in);
        View.mathematicalProcess2();
        View.firstOperation();
        int numberOne = scanner.nextInt();
        View.secondOperation();
        int numberTwo = scanner.nextInt();

        String mathematicalProcess = "\tThe result of multiplication is  "+numberOne * numberTwo +"\n";
        System.out.println(mathematicalProcess);

    }

}
