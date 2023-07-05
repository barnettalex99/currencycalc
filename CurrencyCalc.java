import java.util.Scanner;

public class CurrencyCalc {


 public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        String welcomeMessage = "Welcome to the currency calculator. Please type the type of currency that you would like to convert (dollars, euros, pounds).";
        String type1confirmation;
        String type2confirmation;
        String finalMessage;
        String currencyType1;
        String currencyType2;
        boolean currency1valid = false;
        boolean value1valid = false;
        boolean currency2valid = false;
        double value1;
        double finalValue;

        System.out.println(welcomeMessage);
        while(currency1valid == false){
            currencyType1 = input.nextLine();
        if(currencyType1.equals("dollars")){
            type1confirmation = "You selected to convert dollars. How many dollars would you like to convert?";
            currency1valid = true;
            System.out.println(type1confirmation);
        } else if(currencyType1.equals("euros")){
             type1confirmation = "You selected to convert euros. How many euros would you like to convert?";
             currency1valid = true;
             System.out.println(type1confirmation);
        } else if(currencyType1.equals("pounds")){
             type1confirmation = "You selected to convert pounds. How many pounds would you like to convert?";
             currency1valid = true;
             System.out.println(type1confirmation);
        } else {
            type1confirmation = "You did not select an appropriate choice. The possible options are: dollars, euros, or pounds. Please try again.";
            currency1valid = false;
            System.out.println(type1confirmation);
        }
        }
        while(value1valid == false){
            String valueString = input.nextLine();
            if(valueString.isNumeric()){
                //check for how to do isnumeric
                //cast to double
                value1valid = true;
            } else {
                
            }
        }

        while(currency2valid == false){
            currencyType2 = input.nextLine();
        if(currencyType1.equals("dollars") && currencyType2.equals("dollars")){
            //calculation here
            //round to proper format
            finalMessage = "You selected to convert from dollars to dollars. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
            currency2valid = true;
            System.out.println(finalMessage);
        } else if(currencyType1.equals("dollars") && currencyType2.equals("euros")){
            //calculation here
             finalMessage = "You selected to convert from dollars to euros. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("dollars") && currencyType2.equals("pounds")){
            //calculation here
             finalMessage = "You selected to convert from dollars to pounds. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("pounds")){
             type1confirmation = "You selected to convert from pounds to pounds. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("dollars")){
             finalMessage = "You selected to convert from pounds to dollars. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("euros")){
             finalMessage = "You selected to convert from pounds to euros. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("euros")){
             finalMessage = "You selected to convert from euros to euros. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("dollars")){
             finalMessage = "You selected to convert from euros to dollars. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("pounds")){
             finalMessage = "You selected to convert from euros to pounds. The conversion of " + currencyType1 + " to " + currencyType2 + " is: " + finalValue;
             currency2valid = true;
             System.out.println(finalMessage);
        }
        else {
            type1confirmation = "You did not select an appropriate choice. The possible options are: dollars, euros, or pounds. Please try again.";
            currency1valid = false;
            System.out.println(type1confirmation);
        }
        }

        input.close();
    }


}