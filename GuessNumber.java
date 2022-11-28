import java.util.Scanner;
public class GuessNumber{
   public static void guessgame(){
       Scanner sc=new Scanner(System.in);
       int number=1+(int)(100*Math.random());
       int t=10;
       int i,guess;
       System.out.println("A number is choosen "+"between 1 to 100" +" guess number within 10 trials");
       for( i=0;i<t;i++){
           System.out.println("\tGuess the number:");
           guess=sc.nextInt();
           if(number==guess){
               System.out.println("congratulations!! You are Guess the correct number");
               break;
           }
           else if(number>guess && i!=t-1){
                System.out.println("The number is " +"greater than "+guess+" ");
           }
           else if(number<guess && i!=t-1){
                System.out.println("The number is "+"less than "+guess+" ");
           }
       }
       if(i==t){
          
                System.out.println("You are exhausted"+t+"trials");
          System.out.println("number was"+number);
       }
   } 
   public static void main(String args[]){
       guessgame();
   }
}