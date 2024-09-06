import java.util.Scanner;
public class Question3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age for verification: ");
        int verify = sc.nextInt();

        if (verify >= 18){
            System.out.println("You are eligible to vote.");
            if (verify <= 17) {                                    //always false
                System.out.println("Minors are ineligible to vote");
            }
        }
    }
}
