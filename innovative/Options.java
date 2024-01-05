package innovative;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
 
public class Options {
	 long accountno;
	 String name;
	 long balance;
	 String username,bankname,password;

     public Options(){

     }
	 
	
	public void signup() {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Name:");
	 name=scan.nextLine();
	 
	 System.out.println("UserName:");
     username=scan.nextLine();

	 
	 System.out.println("Password:");//add check password for later
	 password=scan.nextLine();
	 
	 System.out.println("BankName:");
     bankname=scan.nextLine();
     
     	 
	 System.out.println("Account no:");
      accountno=scan.nextLong();
	 
	 System.out.println("Add Balance(min 10,000Rs):");
	 balance=scan.nextLong();
	 

	 
	 String fileName = "user_data.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("UserName: " + username);
            writer.newLine();
            writer.write("Password: " + password);
            writer.close();
            writer.write("BankName: " + bankname);
            writer.newLine();
            writer.write("Account no: " + accountno);
            writer.newLine();
            writer.write("Balance: " + balance);
            writer.newLine();
           
            System.out.println("User data saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

   

	public boolean login(String inputUsername, String inputPassword) {
        String fileName = "user_data.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("UserName: " + inputUsername)) {
                    while (scanner.hasNextLine()) {
                        String passwordLine = scanner.nextLine();
                        if (passwordLine.startsWith("Password: " + inputPassword)) {
                            fileReader.close();
                            return true; // Username and password match
                        }
                    }
                }
            }
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false; // Username or password doesn't match
    }

}
