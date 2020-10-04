 import java.util.Scanner;

/**
 * This program indetifies animals
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user input
   Scanner input = new Scanner(System.in);
    
   //ask the user if the animal has feathers 
   System.out.println("does the animal have feathers?");
   String feathers = input.nextLine(); 

   //check to see if animal has feathers 
   if(feathers .equals("yes")){ 
   //check to see if the animal swims
   System.out.println("does your animal swim?"); 
   String swim = input.nextLine(); 
   //determine what kind of bird 
   if(swim .equals("yes")){
     System.out.println("this is a duck");
   }else if(swim .equals("no")){ 
     System.out.println("this is a hen");
   }  
   //if the user answered no
   }else{
     System.out.println("does the animal have legs?");
     String legs = input.nextLine(); 
    if(legs .equals ("yes")){
    System.out.println("this a lizard");  
   }else{
     System.out.println("this is a snake");
   } 
   } 

  }
}
             
