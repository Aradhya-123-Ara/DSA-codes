public class Main {
    public static void main(String[] args) {

    int n = 4;
    int m = 5;
    
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    }
}
// hollow Rectangle
public class Main {
    public static void main(String[] args) {

    int n = 4;
    int m = 5;
    
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
            
            if(i == 1 || j == 1 || i == n || j == m){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
        System.out.println();
        
    }
    }
}
//Traingle pattern
public class Main {
    public static void main(String[] args) {

    int n = 4;
    int m = 5;
    
    for(int i = 0; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    }
}
// Lower triangle 
public class Main {
    public static void main(String[] args) {

    int n = 4;
    int m = 5;
    
    for(int i = n; i >= 0; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    }
}
// inverted half pyramid

public class Main {
    public static void main(String[] args) {

    int n = 4;
    int m = 5;
    
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n - i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
    System.out.println("*");
    }
    }
}
// to print pyramid numbers 
public class Main {
    public static void main(String[] args) {

    int n = 4;
    
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
    System.out.println();
    }
    }
}
//inverted
public class Main {
    public static void main(String[] args) {

    int n = 4;
    
    for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
    System.out.println();
    }
    }
}
//floyd pattern
public class Main {
    public static void main(String[] args) {

    int n = 4;
    int number = 1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(number+" ");
            number++;
        }
    System.out.println();
    }
    }
}
// 0-1 triangle 
public class Main {
    public static void main(String[] args) {

    int n = 4;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            if((i + j) % 2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
    System.out.println();
    }
    }
}
//solid rohmbus

class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
    }
}
//number pyramid
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= n - i; j++){
               System.out.print(" ");
           }
           for(int j = 1; j <= i; j++){
               System.out.print(i + " ");
           }
           System.out.println();
       }

    }
}
//butterfly pattern
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 4;

        // Upper Half
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
//diamond pattern
import java.util.*;


public class Solutions {
   public static void main(String args[]) {
       int n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //first part
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }

           System.out.println();
       }
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //second part
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
   }   
}
}
