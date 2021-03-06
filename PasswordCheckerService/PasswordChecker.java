// Kyle Orcutt
// simple password checker done in my early school days

import java.util.Scanner;
public class PasswordChecker
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String password = "";
        boolean hasNumber = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean invalidCharacter = false;
        boolean hasPassword = false;
        boolean tooSmall = false;
        String lowerCasePassword = "";

        while (!(password.equals("endofinput "))){
            System.out.println("Enter password: " + "Once valid, enter endofinput to exit.");
            password = input.nextLine();

            lowerCasePassword = password.toLowerCase();

            tooSmall = false;
            hasPassword = false;
            invalidCharacter = false;
            hasLowerCase = false;
            hasUpperCase = false;
            hasNumber = false;

            if (password.equals("endofinput")){
                System.out.println();
                break;
            } 
            if (password.length() < 8) {
                tooSmall = true;
            }
            if (lowerCasePassword.contains("password")){
                hasPassword = true;
            }
            for (int x = 0; x < password.length(); x++){
                char c = password.charAt(x);

                if (Character.isDigit(c)){
                    hasNumber = true;

                }else if (Character.isUpperCase(c)){
                    hasUpperCase = true;
                }else if (Character.isLowerCase(c)){
                    hasLowerCase = true;
                }else if (!(Character.isLetterOrDigit(c))){
                    invalidCharacter = true;

                }

            }
            System.out.print((hasNumber)? "" : "Password needs to have a number \n");
            System.out.print((hasUpperCase)? "" : "Password needs to have an uppercase letter \n");
            System.out.print((hasLowerCase)? "" : "Password needs to have a lowercase letter \n");
            System.out.print((invalidCharacter)? "Password can only contain letters or digits \n" : "");
            System.out.print((tooSmall)? "Password must be at least 8 characters long \n" : "");
            System.out.print((hasPassword)? "Password cannot contain the word password \n" : "");

            if (hasNumber == true && hasUpperCase == true && hasLowerCase == true && invalidCharacter == false && tooSmall == false && hasPassword == false){
                System.out.println(password + " is a valid password");
            }
        }

    }
}