package utils;

import java.util.Scanner;

public class InputUtils {
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);
        int num = 0;

        boolean valid = false;
        while(!valid) {
            System.out.println(prompt);
            if (input.hasNextInt()) {
                num = input.nextInt();
                valid = true;
            }else{
                System.out.println("Please enter an integer!");
                input.nextLine();
            }
        }
        return num;
    }
}
