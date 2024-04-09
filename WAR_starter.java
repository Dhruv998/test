import java.util.Random;
import java.util.Scanner;
public class WAR_starter {
    public static void main(String[] args){
       
       
        Scanner MyObj = new Scanner(System.in);
        String username;
        
        System.out.println("Enter Username");
        username = MyObj.nextLine();
        System.out.println("hi"+ username);

        MyObj.close();  
        // Generate cards 1-52
        Random rand = new Random();
        int computerCARD = rand.nextInt(52);
        int userCARD = rand.nextInt(52); 
        if(computerCARD == 0){
            computerCARD += 1;
        }
        if(userCARD == 0){
            userCARD += 1;
        }

        //Finds suit for computer
        char suitForComputer;
        int cardNumberForComputer;
        if (computerCARD >= 1 && computerCARD <= 13){
            suitForComputer = 'C'; 
        } else if (computerCARD >= 14 && computerCARD <= 26){
            suitForComputer = 'D';
        } else if (computerCARD >= 27 && computerCARD <= 39){
            suitForComputer = 'H';
        } else{
            suitForComputer = 'S';
        } 
        //Finds suit for user
        char suitForUser;
        int cardNumberForUser;
        if (userCARD >= 1 && userCARD <= 13){
            suitForUser = 'C'; 
        } else if (userCARD >= 14 && userCARD <= 26){
            suitForUser = 'D';
        } else if (userCARD >= 27 && userCARD <= 39){
            suitForUser = 'H';
        } else{
            suitForUser = 'S';
        } 

    
        
        
        cardNumberForComputer = computerCARD % 13;
        cardNumberForUser = userCARD % 13;
        
        
        
        //printing code

        
        printAsciiEval("" + suitForComputer + cardNumberForComputer, "" + suitForUser + cardNumberForComputer );

        if (cardNumberForComputer > cardNumberForUser) {
            System.out.println("You Lose! Too Bad...");
        } else if (cardNumberForComputer < cardNumberForUser){
            System.out.println("You Win!");
        } else if (cardNumberForComputer == cardNumberForUser) {
            System.out.println("WAR!");
        }
    }
    
    public static void printAsciiEval(String computerCard, String userCard) {

        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

       
       
       
       
       
       
       
       
       
       //Graphics (boring, not tht important or good either.)
       
        System.out.println("------------");
        System.out.println("--COMPUTER--");
        System.out.println("------------");
        System.out.println("-----VS-----");
        System.out.println("------------");
        System.out.println("----USER----");
        System.out.println("------------");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
      
        System.out.println("┌─────────┐");
       
        System.out.println("│" + card + "       │");
        System.out.println("│         │");
        System.out.println("│         │");
        System.out.println("│    " + card + "   │"); 
        System.out.println("│         │");
        System.out.println("│         │");
       
        System.out.println("│       " + card + "│");
       
        System.out.println("└─────────┘");
    }

    public static void printAscii_3Char_card(String card){
       
        System.out.println("┌──────────┐");

        System.out.println("│" + card + "       │");
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │");
        System.out.println("│          │");
        System.out.println("│          │");

        System.out.println("│       " + card + "│");
        System.out.println("└──────────┘");



    
           
        
    }
}
