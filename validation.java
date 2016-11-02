package validation;
import java.util.Scanner;
public class validation { 

	public void validation(){
		int x = 0; 
		System.out.println("Please enter the phone number: "); 
		while(!rightNumber){ 

		if (x>0){System.out.println("Phone number is incorrect. Please enter the phone number: ");} 
		Scanner scan = new Scanner(System.in); 
		userInput = scan.nextLine(); 

		long userInputLength = userInput.length(); 

		char[] sChar = getS().toCharArray(); 


		for(char s1 : sChar){ 
		if (userInput.contains(String.valueOf(s1))) { 
		rightNumber = false; x++; 
		}else if (userInputLength != 10){ 
		rightNumber = false; x++; 
		}else{rightNumber = true;}}} 

		System.out.println("Phone number is correct"); 


		long number = Long.parseLong(userInput); 

		long sum = 0; 

		while (number > 0){ 
		sum = sum + number % 10; 
		number = number / 10; 
		if (number == 0 && sum >9) { System.out.println("Calculation sum is: " + sum);
		number = sum; 
		sum = 0; 
		} 
		} 

		System.out.println("Calculation sum is: " + sum); 

		if (sum == 1){System.out.println("Final result is: One"); 
		}else if(sum == 2){System.out.println("Final result is: Two"); 
		}else if(sum == 3){System.out.println("Final result is: Three"); 
		}else if(sum == 4){System.out.println("Final result is: Four"); 
		}else if(sum == 5){System.out.println("Final result is: Five"); 
		}else if(sum == 6){System.out.println("Final result is: Six"); 
		}else if(sum == 7){System.out.println("Final result is: Seven"); 
		}else if(sum == 8){System.out.println("Final result is: Eight"); 
		}else{System.out.println("Final result is: Nine"); 
		} 
	}
	
public static boolean rightNumber = false; 

public static String userInput = "0"; 

private String s = "qwertyuiopasdfghjklzxcvbnm,.[]\'/.;!@#$%^&*()_+=- "; 

public void setS(String ss){ 
ss = s; 
} 

public String getS(){ 
return s; 


} 

}

