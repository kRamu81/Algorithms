package Exception_Handling.Day2;

import java.util.*;
public class Throws_keyword {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();
        if(age >= 18){
            System.out.println("Eligible for voting");
        }
        else{
            throw new InvalidAgeException ("Not Eligible for Voting");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
