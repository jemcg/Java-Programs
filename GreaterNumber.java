import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number");
        int secNum = Integer.parseInt(reader.nextLine());
        
        if (firstNum == secNum) {
            System.out.println("The numbers are equal!");
        } else if (firstNum > secNum) {
            System.out.println("Greater number: " + firstNum);
        } else {
            System.out.println("Greater number: " + secNum);
        }
        
        
        
        
        
        
        

    }
}
