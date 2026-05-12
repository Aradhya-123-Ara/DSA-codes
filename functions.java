//printmy name
import java.util.Scanner;
public class Main{
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        printMyName(name);
    }
}
//sum of 2 no.
import java.util.Scanner;
public class Main{
    
    public static int calculateSum(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculateSum(a , b);
        System.out.println(sum);
    }
}
// Multiplication 
import java.util.Scanner;
public class Main{
    
    public static int calculateMul(int a , int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int mul = calculateMul(a , b);
        System.out.println(mul);
    }
}
//subtration
import java.util.Scanner;

public class Main{
    public static int calculateSub(int a, int b){
        return a - b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        System.out.println(calculateSub(a,b));
    }
}
//factorial
import java.util.Scanner;

public class Main{
    public static int factorial(int n){
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        System.out.println(factorial(n));
    }
}
// to get average using function
import java.util.Scanner;

public class Main{
    public static int CalculateAverage(int a, int b, int c){
        int n = 3;
        int Average = a + b + c/n;
        return Average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int Average = CalculateAverage(a, b, c);
        System.out.print(Average);
    }
}
// sum of all odd numbers
import java.util.Scanner;

public class Main{
    public static int CalculateSum(int n){
    int sum = 0;

        for(int i = 1; i <= n; i++) {

            if(i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = CalculateSum(n);
        System.out.print(sum);
        
    }
}
//calculate greater
import java.util.Scanner;

public class Main{
    public static int CalculateGreater(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int Greater = CalculateGreater(a,b);
        System.out.print(Greater);
    }
    
}
// circumference of circle
import java.util.Scanner;

public class Main{
    public static double CalculateRadius(double r){
        double Radius = 2 * 3.14 * r;
        return Radius;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double Radius = CalculateRadius(r);
        System.out.print(Radius);
        
        
    }
}
// voting eligibility
import java.util.Scanner;

public class Main{
    public static void CalculateAge(int age){
        if(age >= 18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        CalculateAge(age);
    }
}
// infinite loop by do while
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = 0;
        do{
            System.out.println("Hello");
        }
        while(i <= n);
    }
}
// to calculate power
import java.util.Scanner;

public class Main{
   public static double CalculatePower(int x, int n){
       double power = Math.pow(x,n);
       return power;
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n = sc.nextInt();
       
       double power = CalculatePower(x,n);
       System.out.print(power);
   }
}
// to get total of positives , negatives or zeros
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int positive = 0;
       int negative = 0;
       int zeros = 0;
       
       System.out.print("Enter the number till wherre you want to print:");
       int n = sc.nextInt();
       
       for(int i = 1; i <= n; i++){
           int num = sc.nextInt();
           
           if(num > 0){
               positive++;
           }else if(num < 0){
               negative++;
           }else{
               zeros++;
           }
       }
       System.out.println("Positives = " + positive);
       System.out.println("Negatives = " + negative);
       System.out.println("Zeros = " + zeros);
       
   }
}
// fibonacci
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int a = 0; 
       int b = 1;
       
       for(int i = 1; i <= n; i++){
           System.out.print(a);
           int c = a + b;
           a = b;
           b = c;
       }
   }
}
