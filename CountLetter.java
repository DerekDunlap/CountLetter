//Name: Derek Dunlap
//Date: 2/5/21
//A Java program that counts the number of letters within a given string provided by the user.
//Then, displays the number of leters that are within the string.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;//Import Scanner
public class CountLetter{
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//Creates an instance of the Scanner class called input.
		System.out.println("Enter your name: ");//Displays a  message to instruct the user to input a name.
		String name=input.nextLine();//Assigns the value input by the user to the variable name of String type.
		System.out.println("My name is "+name);//Displays the name that the user has entered.
		System.out.print("The string length of '"+name+"' is: "+countName(name));//Calls the countName method and returns a integer value and displays the given message.
		
	 }
	public static int countName(String n) {
		int count=0;//Declares the counter with the default value of 0.
		//For-loop that iterates for the lenght of the string the user has entered.
		for(int i=0; i<n.length();i++) {
			char letter=n.charAt(i);//Declares letter of char type and assigns n.charAt(i) to it.
			//Test if each letter is not a letter or space based on ASCII code value. Terminates program if this condition is true.
			if(!(letter>= 65 && letter <=90 || letter>=97 && letter<=122 || letter==32)){
				System.out.print("Error!");//Displays Error message.
				System.exit(letter);//Terminates program
			//If the letter is an actual letter or space then counts each letter until the end of the name.
			}else {
				count++;//Counts each letter.
			}
		}
		return count;//Returns the value stored in count to the main method.
	}
}