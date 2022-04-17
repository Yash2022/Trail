
import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;
import static javafx.scene.input.KeyCode.Z;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ysach
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ln = new Scanner(System.in);
        String password = ln.next();
        if(checkLength(password) && checkUpper(password) && checkSpecial(password))
        {
           System.out.println("The Password is Valid");
        }
        else {
             System.out.println("The Password is not Valid");
        }
    }
public static boolean checkLength(String pass)
{
   if(pass.length()>=8)
   {
      return true;
   }
   return false;
    }
public static boolean checkUpper(String pass)
           { 
               for (int i = 0; i < pass.length(); i++) 
               {
                    if (Character.isUpperCase(pass.charAt(i))) {
                            return true;
                       }
                 }
           return false;
           }
public static boolean checkSpecial(String pass)
           {    
               
                   if ((pass.contains("@") || pass.contains("#")
              || pass.contains("!") || pass.contains("~")
              || pass.contains("$") || pass.contains("%")
              || pass.contains("^") || pass.contains("&")
              || pass.contains("*") || pass.contains("(")
              || pass.contains(")") || pass.contains("-")
              || pass.contains("+") || pass.contains("/")
              || pass.contains(":") || pass.contains(".")
              || pass.contains(", ") || pass.contains("<")
              || pass.contains(">") || pass.contains("?")
              || pass.contains("|"))) {
            return true;
        }
                   
                 
           return false;
 
}
}


