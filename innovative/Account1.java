package innovative;


import java.util.*;


public class Account1  {

    public void addbalance()
    {
      

    }
    public void withdrawmoney()
    {

    }
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
        
        while(true)
        {
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

        System.out.println("Enter your Username:");
        String loginUsername = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter your Password:");
        String loginPassword = scan.nextLine();

        if (obj3.login(loginUsername, loginPassword)) {
            System.out.println("Login successful!");

            System.out.println("choose:  1.place bet:\n 2.check balance \n3.add balance \n4.withdraw from account ");//check your balance\n 3. Place a bet");
        
            int choice2 = scan.nextInt();
                 switch(choice2)
                 {
                  case 1:
                    obj.placeBet();
                  case 2:
                  obj.checkBalance();
                  case 3:
                    obj.addbalance();

                  case 4:
                  obj.withdrawmoney();
                 }
        }
         else {
            System.out.println("Invalid username or password. Login failed.");
        }
       
                 
                    
                 
        break;
      }
    }

       }

      
       
}
    