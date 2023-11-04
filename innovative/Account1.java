package innovative;


import java.util.*;


public class Account1  {

    

    public void checkBalance() {
        
        System.out.println("Balance checked.");
    }

    public void placeBet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Place a bet: ");
        long money = scan.nextLong();
        scan.nextLine();
      //random 
        Outcomes obj2=new Outcomes();
        String ans=obj2.list();
      //guess
        System.out.println("Enter your outcome: ");
        String userInput = scan.nextLine();
        
      
        
        if (userInput.equalsIgnoreCase(ans)) {
         System.out.println("You guessed it right! The outcome was: " + ans);
        } else {
         System.out.println("Wrong guess. The actual outcome was: " + ans);
        }
    }
    public static void main(String[] args) {
    	 Scanner scan = new Scanner(System.in);

        
               System.out.println("WELCOME TO OUR APP");
        System.out.println("choose:  1. signup\n 2.login ");//check your balance\n 3. Place a bet");
        
        int choice = scan.nextInt();
        Account1 obj = new Account1();
       Options obj3=new Options();
        switch(choice)
       {
        case 1:
       obj3.signup();
       
        break;
        case 2:
       obj3.login();
       
        break;
//        case 3:
//        obj.placeBet();
//      
       }

      
       
}
    }