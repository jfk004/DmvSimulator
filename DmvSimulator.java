package DmvSimulator;

import java.util.Random;
public class DmvSimulator {
    
    public static void main(String[] args) {

        System.out.println("Welcome to the DMV!!!");

        Random random = new Random();

        int userNumber = random.nextInt(100) + 1;

        System.out.println("Your Number is: " + userNumber);

        System.out.println("Calling Out:");

        for (int i = 1; i <= 100; i++) {
            int currentNumber = (userNumber + i) % 100;
            
            if(currentNumber == 0 ){
                currentNumber = 100;
            }

            System.out.println("Number:" + currentNumber);
            
        }

        System.out.println("Sorry you don't have the required paperwork");


    }
}
