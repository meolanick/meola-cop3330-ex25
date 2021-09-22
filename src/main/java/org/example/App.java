/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        String password;

        System.out.println("Enter your password:");
        password = scan.next();

        passwordValidator(password);
    }

    public static void passwordValidator(String password)
    {
        int n = password.length();

        boolean hasLetter = false, hasDigit = false, specialChar = false;

        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        for (char i : password.toCharArray())
        {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        System.out.print("The password "+ "\'" + password + "\'");

        if (hasDigit && hasLetter && specialChar && (n >= 8))
        {
            System.out.print(" is a very strong password.");
        }
        else if (hasLetter && hasDigit && (n >= 8))
        {
            System.out.print(" is a strong password. ");
        }
        else if (hasLetter && (n<8))
        {
            System.out.print(" is a weak password.");
        }
        else if (hasDigit && (n<8))
        {
            System.out.print(" is a very weak password.");
        }
    }

}
