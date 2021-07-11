/**
 * Purpose : User Registration
 *           User will input mobileValidate
 *           Validate the user inputs using regex Lambda Function.
 *           If matches, return valid else not valid
 */

package com.lambdafunction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    @FunctionalInterface
    interface User{
        void mobileValidate();
    }

    public class UserRegistration {

        public static void main(String[] args ){
            //Lambda -> operator uses

            User user = () -> {

                Scanner sc = new Scanner(System.in);

                String regex = "^(91){1}[0-9]{9}$";

                System.out.println("Enter your Mobile number");
                String email = sc.next();

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);

                if(matcher.matches()){
                    System.out.println("Given mobile number is valid");
                }else
                {
                    System.out.println("Given mobile number. is not valid");
                }
            };
            user.mobileValidate();

        }
    }
