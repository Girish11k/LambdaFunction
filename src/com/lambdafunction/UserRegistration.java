/**
 * Purpose : User Registration
 *           User will input lastName
 *           Validate the user inputs using regex Lambda Function.
 *           If matches, return valid else not valid
 *
 */
package com.lambdafunction;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    @FunctionalInterface
    interface LastName{
        void lastNameValidate();
    }


    public class UserRegistration {
        public static void main(String[] args ){
            //Lambda -> operator uses
            LastName lName = () -> {
                Scanner sc = new Scanner(System.in);

                String regex = "^[A-Z]{1}[a-z]{3,20}$";

                System.out.println("Enter your last name");
                String name = sc.next();

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(name);
                if(matcher.matches()){
                    System.out.println("Given last name id is valid");
                }else{
                    System.out.println("Given last name id is not valid");
                }
            };
            lName.lastNameValidate();

        }
    }
