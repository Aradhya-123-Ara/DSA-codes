import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.println("Enter a number(0 - 1): ");
        n = sc.nextInt();
        
        if(n == 1){
            System.out.println("Enter marks(0 - 100): ");
            int marks = sc.nextInt();
        
            if(marks >= 90){
                System.out.println("Good");
            }
            else if(marks <= 89 && marks >= 60){
                System.out.println("This is also good");
            }
            else if (marks <= 59 && marks >= 0){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Keep going");
            }
        }
            
        }
        while (n != 0);
            
        
    }
}
