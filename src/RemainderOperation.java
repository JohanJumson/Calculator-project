import java.util.Scanner;

public class RemainderOperation {

    public static void remainder(){
        View view = new View();

        Scanner scanner = new Scanner(System.in);

        view.remainderProcess();

        view.firstOperation();
        int numberOne = scanner.nextInt();

        view.secondOperation();
        int numberTwo = scanner.nextInt();


        String remainderProcess = "\t The result of remainder is  " + (numberOne % numberTwo) +"\n";
        System.out.println(remainderProcess);

    }
}
