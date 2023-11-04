package innovative;
import java.util.*;
 interface x
 {
	 void signup();
	 void login();
 }
public class Options implements x {
	 long accountno;
	 String name;
	 long balance;
	 String username,bankname,password;
	 
	@Override
	public void signup() {
		Scanner scan=new Scanner(System.in);
	 System.out.println("Name:");
	 name=scan.nextLine();
	 
	 System.out.println("UserName:");
     username=scan.nextLine();

	 
	 System.out.println("BankName:");
     bankname=scan.nextLine();
     
     	 
	 System.out.println("Account no:");
      accountno=scan.nextLong();
	 
	 System.out.println("Add Balance(min 500Rs):");
	 balance=scan.nextLong();
	 
	 System.out.println("Password:");//add check password for later
	 password=scan.nextLine();
	 
	 
	}

	@Override
	public void login() {
	
		System.out.println("Enter UserName:");
		//check with file
		System.out.println("Password:");
		//check with file
	}

}
