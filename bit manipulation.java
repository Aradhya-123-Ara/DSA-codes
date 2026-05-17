//get bit = operation perform AND = &
import java.util.Scanner;

public class Strings{
    public static void main(String[] args){
        int n = 5; //0101
        int pos = 2;
        int bitmask = 1 << pos; // bitmask is a statement for bit manipulation that find that perform shifft operation for program
        
        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
// set bit  perform operation OR = |
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n = 5;//0101
        int pos = 1;
        int bitmask = 1 << pos;
        
        int newnumber = (bitmask | n);
            System.out.println(newnumber);
    }
}
// clear bit = perform AND or NOT operation // & // ~
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n = 5;//0101
        int pos = 2;
        int bitmask = 1 << pos;
        
        int newbitmask = ~(bitmask);
        int newnumber = newbitmask & n;
        
        System.out.println(newnumber);
    }
}
//update bit
// for 0 = operation AND or NOT
//for 1 = operaton OR
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;//0101
        int pos = 1;
         int bitmask = 1 << pos;
        
        if(oper == 1){
        
        int newNumber = bitmask | n;
        
        System.out.println(newNumber);
        }else{
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n;
            
            System.out.println(newNumber);
        }
    }
}
