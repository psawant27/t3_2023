import java.util.Scanner;
 

public class CubeOfNumberInJava {
    public static void main(String[] args) {
    
           Scanner scanner = new Scanner(System.in);
 
           System.out.print("Enter number : ");
           int number = scanner.nextInt();
 
           //calculate cube of number
           int cubeOfNumber = number * number * number;
           
           System.out.println("cube of "+number+" is "+cubeOfNumber);
           
    }
}
