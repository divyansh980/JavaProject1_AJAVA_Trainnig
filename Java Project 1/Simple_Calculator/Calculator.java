

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);

                System.out.println("Welcome to the calculator");
                System.out.println("Enter the Choise: ");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Mulplication");
                System.out.println("4.Division");
                System.out.println("5. Exit");

                int choise = scanner.nextInt();

                switch (choise) {
                        case 1:
                                System.out.println("Enter the two numbers: ");
                                double addNum1 = scanner.nextDouble();
                                double addNum2 = scanner.nextDouble();
                                System.out.println("Result: "+(addNum1+addNum2));
                                break;
                
                        

                        case 2:
                                System.out.println("Enter the two numbers: ");
                                double subNum1 = scanner.nextDouble();
                                double subNum2 = scanner.nextDouble();
                                System.out.println("Result: "+(subNum1 - subNum2));
                                break;

                        case 3:
                                System.out.println("Enter the two numbers: ");
                                double mulNum1 = scanner.nextDouble();
                                double mulNum2 = scanner.nextDouble();
                                System.out.println("Result: "+(mulNum1 * mulNum2));
                                break;

                        case 4:
                                System.out.println("Enter the two numbers: ");
                                double divNum1 = scanner.nextDouble();
                                double divNum2 = scanner.nextDouble();
                                System.out.println("Result: "+(divNum1 / divNum2));
                                break;
                                     
                                

                        default: 
                             System.out.println("Invalid choise. Please enter number between 1 to 4.");      
                        
                               
                }
                
                scanner.close();

        }
}