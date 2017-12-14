package com.company;

import java.util.Scanner;
import java.io.*;
/**
 * Created by Veronica Lang on 12/11/2017.
 */
//split method for the (A&&B)||C?
public class Tester {
    public static void main(String[] args) {
        {
            for (; ; ) { //infinite loop ;^o

                //setting userInput
                Scanner userInput = new Scanner(System.in);
                System.out.println("\nEnter a boolean expression");
                String expression = userInput.nextLine();
                //userInput.close();

                //finding IndexOf && or ||
                int andIndx = expression.indexOf("&&");
                int orIndx = expression.indexOf("||");

                //implementing methods
                if (andIndx != -1 && orIndx == -1) { //if there is &&
                    System.out.println("T = True and F = False");
                    for (int i = 1; i <= 4; i++) {
                        String s = expression, lettersUsedinExpression[];
                        lettersUsedinExpression = expression.split("&&");
                        String a = lettersUsedinExpression[0];
                        String b = lettersUsedinExpression[1];
                        //a --> false ?? how to do just treat as diff variable?
                        Boolean c = false; // for a
                        Boolean d = false; // for b
                        //set a or b to false etc
                        if (i == 1) {
                            c = false;
                            d = false;
                            System.out.println("When " + lettersUsedinExpression[0] + " = F and "
                                    + lettersUsedinExpression[1] + " = F --> " + String.valueOf(c && d));
                        } else if (i == 2) {
                            c = false;
                            d = true;
                            System.out.println("When " + lettersUsedinExpression[0] + " = F and "
                                    + lettersUsedinExpression[1] + " = T --> " + String.valueOf(c && d));

                        } else if (i == 3) {
                            c = true;
                            d = false;
                            System.out.println("When " + lettersUsedinExpression[0] + " = T and "
                                    + lettersUsedinExpression[1] + " = F --> " + String.valueOf(c && d));

                        } else if (i == 4) {
                            c = true;
                            d = true;
                            System.out.println("When " + lettersUsedinExpression[0] + " = T and "
                                    + lettersUsedinExpression[1] + " = T --> " + String.valueOf(c && d));

                        }
                    }


                } else if (andIndx == -1 && orIndx == 1) { //if there is ||
                    System.out.println("T = True and F = False");
                    for (int x = 1; x <= 4; x++) {
                        String s = expression, lettersUsedinExpression[];
                        lettersUsedinExpression = expression.split("\\|\\|");
                        String a = lettersUsedinExpression[0];
                        String b = lettersUsedinExpression[1];
                        //set a or b to false etc
                        Boolean c = false; // for a
                        Boolean d = false; // for b
                        //set a or b to false etc
                        if (x == 1) {
                            c = false;
                            d = false;
                            System.out.println("When " + lettersUsedinExpression[0] + " = F and "
                                    + lettersUsedinExpression[1] + " = F --> " + String.valueOf(c || d));

                        } else if (x == 2) {
                            c = false;
                            d = true;
                            System.out.println("When " + lettersUsedinExpression[0] + " = F and "
                                    + lettersUsedinExpression[1] + " = T --> " + String.valueOf(c || d));

                        } else if (x == 3) {
                            c = true;
                            d = false;
                            System.out.println("When " + lettersUsedinExpression[0] + " = T and "
                                    + lettersUsedinExpression[1] + " = F --> " + String.valueOf(c || d));

                        } else if (x == 4) {
                            c = true;
                            d = true;
                            System.out.println("When " + lettersUsedinExpression[0] + " = T and "
                                    + lettersUsedinExpression[1] + " = T --> " + String.valueOf(c || d));

                        }
                    }
                } else if (andIndx == 1 && orIndx == 1) { //this one will be for checking multiple
                    System.out.println("T = True and F = False");
                    //use a for-loop that finds the index of the 1st occurrence and increment it while storing it
                    //like this:
                    //https://stackoverflow.com/questions/5034442/indexes-of-all-occurrences-of-character-in-a-string
                    //will have to go with the and operation first somehow?? if "|| if towards the right or left of a variable
                    //next to &&, then i dunno i guess need more arrays??
                }else if (expression.equalsIgnoreCase("stop") ||
                        expression.equalsIgnoreCase("quit") ||
                        expression.equalsIgnoreCase("exit") ||
                        expression.equalsIgnoreCase("no")){
                    System.out.println("Okay, bye.");
                    System.exit(0);

                } else if (andIndx == -1 && orIndx == -1) { //doesn't contain any boolean operators
                    System.out.println("That's not a boolean expression you dingus " +
                            "\njust put && or || between two variables or something like that\n" +
                            "It'll reset, so try again?");
                }
            }
        }
    }
}
    /* Printing out to txt file:
    PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
    System.setOut(out);

    Referenced from:
    https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
     */
