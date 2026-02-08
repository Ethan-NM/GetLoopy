import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Random gen = new Random();

       boolean running = true;
       int currentRoll = 1;

       do{
           int dice1 = gen.nextInt(0,6)+1;
           int dice2 = gen.nextInt(0,6)+1;
           int dice3 = gen.nextInt(0,6)+1;

           System.out.printf("%-6s %-6s %-6s %-6s %-6s\n","Roll","Die1","Die2","Die3","Sum");
           System.out.print("-------------------------------------------\n");
           System.out.printf("%-6d %-6d %-6d %-6d %-6d\n",currentRoll,dice1,dice2,dice3,dice1+dice2+dice3);

           currentRoll++;
           boolean R = true;

           do{
              System.out.println("Would you like to roll again? (Y/N)");
              String choice = scanner.nextLine();

              if(choice.equalsIgnoreCase("Y")){
                  R = false;
              }else if(choice.equalsIgnoreCase("N")){
                  R=false;
                  running =false;
              }else{
                  System.out.print("Yes or no! Not: " + choice + "\n");
              }

           }while(R);

       }while(running);

       scanner.close();
    }
}
