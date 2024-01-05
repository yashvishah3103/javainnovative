package innovative;

import java.util.*;

public class Account1  {
  //private long accountBalance = 10000;
 
  public void addBalance(long amount) {  //used to add money if the money is short
    accountBalance += amount; // Used to add money to the account for betting
    System.out.println("Amount added to account: " + amount);
}

    public void withdrawMoney()  //money to withdraw from the betting balance
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw from your betting account: ");
        long withdrawAmount = sc.nextLong();
        if (withdrawAmount <= accountBalance) {
            accountBalance -= withdrawAmount; // Update account balance
            System.out.println("Amount withdrawn from account: " + withdrawAmount);
        } else {
            System.out.println("Insufficient funds in your account.");
        }

    }

    public void transferToBank() {  //transfer the money won to the main bank account
      System.out.println("Transferring remaining balance: " + accountBalance + " to your bank account.");
      accountBalance = 0;
      System.exit(0);
  }

    public void checkBalance() {  //check balance at any current position
      System.out.println("Your current account balance is: " + accountBalance);
    }

    public void placeBet() {

      Scanner scan = new Scanner(System.in);

        while (true) {
            if (accountBalance <= 0) {
                System.out.println("Your money is over.");
                System.out.println("Do you want to add more funds to continue betting? (yes/no)");
                String addMoreFunds = scan.next();
                if (addMoreFunds.equalsIgnoreCase("yes")) {
                  System.out.println("Enter the amount to add to your account: ");
                  addBalance(scan.nextLong());
                  break;
                } else {
                    transferToBank();
                    break;
                }
            }
        System.out.println("Place a bet: ");
        long money = scan.nextLong();
        scan.nextLine();
        if (money > accountBalance) {
          System.out.println("Insufficient funds for this bet. Current balance: " + accountBalance);
          break;
      }
      //random 
        Outcomes obj2=new Outcomes();
        String ans=obj2.list();
      //guess
        System.out.println("Enter your outcome: ");
        String userInput = scan.nextLine();
        
        if (userInput.equalsIgnoreCase(ans)) {
         System.out.println("You guessed it right! The outcome was: " + ans);
         accountBalance = accountBalance + (money * 2);
        } else {
         System.out.println("Wrong guess. The actual outcome was: " + ans);
           accountBalance -= money;
        }
        System.out.println("Remaining balance: " + accountBalance);
        System.out.println("Do you want to place another bet? (yes/no)");
        String continueBet = scan.next();
        if (continueBet.equalsIgnoreCase("no")) {
            transferToBank();
            break;
        }
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
        //scan.nextLine();
        if (obj3.login(loginUsername, loginPassword)) {
           System.out.println("Login successful!");
            int choice2;

            while(true) {
            System.out.println("choose:  1.place bet:\n 2.check balance \n3.add balance \n4.withdraw from account ");//check your balance\n 3. Place a bet");
            choice2 = scan.nextInt();
            
                 switch(choice2)
                 {
                  case 1:
                    obj.placeBet();
                    break;
                  case 2:
                  obj.checkBalance();
                  break;
                  case 3:
                  System.out.println("Enter the amount to add to your account: ");
                    obj.addBalance(scan.nextLong());
                    break;
                  case 4:
                  obj.withdrawMoney();
                  break;
                 }
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