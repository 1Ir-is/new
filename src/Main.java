import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean check = true;
        do {
            try {
                System.out.println("Input:");
                a = sc.nextInt();
                System.out.println(a * 2);
                check = false;
            }
            catch (InputMismatchException e){
                System.out.println("Wrong input");
                sc.next();
            }
        }while (check);
        System.out.println("Hello");
    }
}
