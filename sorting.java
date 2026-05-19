//bubble sort = we comapre the elements one by one int pair , and swap after each comparison 
import java.util.Scanner;
public class Main{
  public static void printArray(int arr[]){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  System.out.println();
}
  public static void main(String[] args){
    int arr[] = {7,8,3,1,2};
    for(int i = 0; i < arr.length - 1; i++){
      for(int j = 0;j < arr.length - i - 1; j++){
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    printArray(arr);
   }
}
// Selection sort = we assume any index smallest , and comapre that element to other and if there is a element less than the assumed smallest
//elemnt then we comapre the element with that new smallest element and keep comapiring like that , and we finally found the smallest index or
//elemnt we swap it with first position element and next time with the i + 1 element 
import java.util.Scanner;
public class Main{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
                    
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                
        }
        printArray(arr);
    }
}
//Insertion sort = in this there are two parts sorted ans unsorted elements we compare the unsorted element with that sorted element and 
//if the current element is less thean the sorted element then we make put that element at its right position , and we comapre the current 
//means unsorted element with every element present in sorted one then put that current element to its right place if it is less than the 
//sorted one while(j >= 0 && arr[j] > current) this is loop in for loop for that
import java.util.Scanner;
public class Main{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        
        printArray(arr);
    }
}
