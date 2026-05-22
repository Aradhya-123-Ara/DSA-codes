//Print numbers from 5 to 1.
import java.util.Scanner;

public class Recursion{
    
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }
    public static void main(String[] args){
        int n = 5;
        printNumber(n);
    }
}
//Print numbers from 1 to 5.
import java.util.Scanner;

public class Main{
    
    public static void printNumber(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }
    public static void main(String[] args){
        int n = 1;
        printNumber(n);
    }
}
//sum of n natural numbers
import java.util.Scanner;

public class Main{
    public static void printSum(int n, int sum){
        if(n == 6){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n + 1, sum);
    }
    public static void main(String[] args){
        System.out.print("the sum is :");
        printSum(1, 0);
    }
}
//to get factorial
import java.util.Scanner;

public class Main{
    public static void calcFact(int n, int fact){
        if(n == 0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        calcFact(n - 1, fact);
    }
    public static void main(String[] args){
        calcFact(5, 1);
    }
}
// fibonacci
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Main{
    public static void printFib(int a, int b, int n){
        if(n == 0){
        return;
    }
    System.out.println(a);
    printFib(b, a + b, n - 1);
        
    }
    public static void main(String[] args){
        printFib(0 , 1 , 5);
    }

}
