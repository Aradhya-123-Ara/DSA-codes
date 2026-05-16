import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "Aradhya";
        String name = "Aradhya";
        
        if(s.compareTo(name) == 0){
            System.out.println("both are same strings");
        }else{
            System.out.print("both are different");
        }
        
        
    }
}
//to find combined length string
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        String name[] = new String[size];
        
        int totLength = 0;
        
        for(int i = 0; i < size; i++){
            name[i] = sc.next();
            
            totLength += name[i].length();
            
        }
        
        System.out.println(totLength);
    }
}
//replace the letter ‘e’ in the original string with letter ‘i’
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        String result = " ";
        
        
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'e'){
                result += "i";
            } else{
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
//You have to create a username from the email by deleting the part that comes after ‘@
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  String email = sc.nextLine();
    String Username = "";

  for(int i = 0; i < email.length(); i++){
    if(email.charAt(i) == '@'){
      break;
    }else{
      Username += email.charAt(i);
    }
  }
    System.out.println(Username);
  }
}
