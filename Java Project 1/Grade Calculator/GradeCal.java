import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of Subjects: ");
        int i = scanner.nextInt();

        double score =0;
        for(int sub = 1; sub<=i; sub++){
                System.out.println("Enter the Score of subject "+ sub +":");
                double scores = scanner.nextDouble();
                score += scores;
        }

        double average = score / i;
        System.out.println("Average score: "+average);
        
        scanner.close();

        if (average >=60 || i >= 90) {
            System.out.println("Passed with grade A"+"\nPassed");
        } else if (i >= 80) {
            System.out.println("Passed with grade B"+"\nPassed");
        }else if(i>=70){
                System.out.println("Passed with grade C"+"\nPassed");
        }else if(i>=50){
                System.out.println("Passed with grade D"+"\nPassed");
        }else if(i<50){
                System.out.println("Failed");
        }
        
    }
}

