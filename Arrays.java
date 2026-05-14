import java.util.Scanner;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      int [] marks = {97, 98, 96};
     
      
      for(int i = 0; i < 3; i++){
          System.out.println(marks[i]);
      }
   }
}
// by user inpput
import java.util.Scanner;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
      int [] marks = new int[size];
     //input
     for(int i = 0; i < size; i++){
         marks[i] = sc.nextInt();
     }
      //output
      for(int i = 0; i < size; i++){
          System.out.println(marks[i]);
      }
   }
}
// found no. at index
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int marks[] = new int[size];
        
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        
        for(int i = 0; i < size; i++){
            if(marks[i] == x){
            System.out.println("Found at index " + i);
            }
        }
    }
}
// to print name
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        String name [] = new String[size];
        
        for(int i = 0; i < size; i++){
            name[i] = sc.next();
        }
        
        for(int i = 0; i < size; i++){
            System.out.println("name 1 is : " + name[i]);
        }
    }
}
// for min max
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        
        int min = Integer.MAX_VALUE;
        
        
        for(int i = 0; i < size; i++){
           if(numbers[i] < min){
               min = numbers[i];
           }
           if(numbers[i] > max){
               max = numbers[i];
           }
        }
        
        System.out.println("largest number is : " + max);
        System.out.println("lowest number is : " + min);
    }
}
// 2D Arrays
// to found location
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int numbers[][] = new int[rows][cols];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.print("Found at index : " + numbers[i][j]);
                }
            }
        }
    }
}
// transpose
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int transpose[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                transpose[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is:");

        for(int j = 0; j < m; j++) {

            for(int i = 0; i < n; i++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }
}
