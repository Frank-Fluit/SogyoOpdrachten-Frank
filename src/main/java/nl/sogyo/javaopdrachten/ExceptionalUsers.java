package nl.sogyo.javaopdrachten;
import java.util.Scanner;

public class ExceptionalUsers{

private static Scanner scanner = new Scanner(System.in);

public static void main(String [] args){
    startUp();
    scanner.close();
} 

private static void startUp() {
    askUsername();
    String password = getUserPassword();
    boolean passwordValidated = passwordValidator(password);
    updatePrompt(passwordValidated);
}

private static void askUsername() {
    System.out.println("Fill in your username");
    scanner.nextLine();
}

private static void updatePrompt(boolean passwordValidated) {
    if(passwordValidated){
        System.out.println("Registered user Sogyo");
    }
    if(!passwordValidated){
        System.out.println("This is not a valid password. Please enter a stronger password.");
        updatePrompt(passwordValidator(getUserPassword()));
    }
}

public static String getUserPassword() {
    System.out.println("Fill in your password");
    String password = scanner.nextLine();
    return password;
}

public static boolean passwordValidator(String userInput){
    boolean status = false;
    if(containsCapitalLetter(userInput) && containsLowercaseLetter(userInput) && containsDigit(userInput)){
        status = true;
    }
    return status;
}

public static boolean containsCapitalLetter(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

public static boolean containsLowercaseLetter(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

public static boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }    
}
