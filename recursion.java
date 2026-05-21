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
