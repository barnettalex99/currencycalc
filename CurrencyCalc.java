import java.util.Scanner;

public class CurrencyCalc {

 public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        String welcomeMessage = "Welcome to the currency calculator. Please type the type of currency that you would like to convert (dollars, euros, pounds).";
        String type1confirmation;
        String type2confirmation;
        String currencyType1;
        int value1;
        System.out.println(welcomeMessage);
        currencyType1 = input.nextLine();
       
        if(currencyType1.equals("dollars")){
            type1confirmation = "You selected to convert dollars. How many dollars would you like to convert?";
        }
        // make else if for if the others are picked/ error message and redo otherwise
        // make input statement for next value (amount)
        // make input statement for next value (what it is being converted to)
        //make calculation if/else if block
        //print output
        //upload to github


        input.close();
    }


}