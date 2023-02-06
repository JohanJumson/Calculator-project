import java.util.Scanner;

public class AdditionOperation {

    public static void addition(){
        View view = new View();

        Scanner scanner = new Scanner(System.in);

        view.additionProcess();

        view.firstOperation();
        int numberOne = scanner.nextInt();

        view.secondOperation();
        int numberTwo = scanner.nextInt();


        String additionProcess = "\t The result of addition is  " + (numberOne + numberTwo)  +"\n";
        System.out.println(additionProcess);

    }
}
