/*
 * Class: CMSC203 
 * Instructor: Dr.Ahmed Tarek
 * Description: Util class displays the messages to the screen while the WiFiDiagnosis class 
 * responds to the user inputs 
 * Due: 2/8/2022
 * Platform/compiler: Eclipse IDE 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here:Giovanni Argueta
*/

import java.util.Scanner;
class Util //class is responsible for displaying strings
{
public static String getString(String msg) {
display(msg);
Scanner input = new Scanner(System.in);
return input.nextLine();
}
public static void display(String msg) {
System.out.print(msg);
}
}
public class WiFiDiagnosis {
	//main class that asks the diagnosis questions  
		public static void main(String[] args)
		{
		//in main method the program prompts user with questions and ends depending on input 
			Util.display("If you have a problem with internet connectivity, this WiFi Diagnosis might work\n");
			String answer = Util.getString("First step: Reboot your computer\nAre you able to connect with the internet? (Yes or No): ");
			if ("yes".equalsIgnoreCase(answer)) { Util.display("Rebooting your computer seemed to work");
			} else {
			answer = Util.getString("Second step: reboot your router\n" + "Now are you able to connect with the internet? (Yes or No): ");
			} if ("yes".equalsIgnoreCase(answer)) {
			Util.display("Rebooting your router seemed to work");
			} else {
			answer = Util.getString("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n"
			+ "Now are you able to connect with the internet? (yes or no): ");
			if ("yes".equalsIgnoreCase(answer)) {
			Util.display("Checking the router's cables seemed to work");
			} else { answer = Util.getString("Fourth step: move your computer closer to your router\n"
			+ "Now are you able to connect with the internet? (yes or no): ");
			if ("yes".equalsIgnoreCase(answer)) {
			Util.display("Moving your computer closer to your router seemed to work");
			} else {
			Util.display("Fifth step: contact your ISP\n"
			+ "Make sure your ISP is hooked up to your router ");
			System.out.println("\nProgrammer Name: Giovanni Argueta");
			}
			}
			}
			}
		
}

