import java.util.Scanner;

public class RemainderOperation {

    public static void remainder(){

        Scanner scanner = new Scanner(System.in);
        View.remainderProcess();
        View.firstOperation();
        int numberOne = scanner.nextInt();
        View.secondOperation();
        int numberTwo = scanner.nextInt();

        String remainderProcess = "\t The result of remainder is  " + (numberOne % numberTwo) +"\n";
        System.out.println(remainderProcess);

    }
}
