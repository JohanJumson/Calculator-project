import java.util.Scanner;

public class Control {

    public static void start() {


        Scanner inputMember = new Scanner(System.in);
        Exit:
        for (; ; )
        {
            View.mainView();
            String check = inputMember.nextLine();

            switch (check)
            {
                case "1":
                    DivisionOperation.division();
                    break;

                case "2":
                    MultiplyOperation.multiply();
                    break;
                case "3":
                    AdditionOperation.addition();
                    break;
                case "4":
                    SubtractionOperation.subtraction();
                    break;
                case "5":
                    RemainderOperation.remainder();
                    break;

                default:
                    System.out.println("error");
            }

        }

    }

}
