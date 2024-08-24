import java.util.Scanner;
public class Days {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dayNum;
    System.out.print("Enter a day number (1-7): ");
    dayNum = in.nextInt();
    switch(dayNum) {
      case 1:
        System.out.println("Monday");
        System.out.println("Its Weekday");
        break;
      case 2:
        System.out.println("Tuesday");
        System.out.println("Its Weekday");
        break;
      case 3:
        System.out.println("Wednesday");
        System.out.println("Its Weekday");
        break;
      case 4:
        System.out.println("Thursday");
        System.out.println("Its Weekday");
        break;
      case 5:
        System.out.println("Friday");
        System.out.println("Its Weekday");
        break;
      case 6:
        System.out.println("Saturday");
        System.out.println("Its Weekend");
        break;
      case 7:
        System.out.println("Sunday");
        System.out.println("Its Weekend");
        break;       
      default:
        System.out.println("Invalid day number.");
        break;                      
    } 
  }
}