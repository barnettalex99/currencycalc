import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyCalc {

    private static final DecimalFormat df = new DecimalFormat("0.00");

 public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        String welcomeMessage = "Welcome to the currency calculator. Please type the type of currency that you would like to convert (dollars, euros, pounds).";
        String type1confirmation;
        String finalMessage;
        String currencyType1 = "";
        String currencyType2;
        boolean currency1valid = false;
        boolean value1valid = false;
        boolean currency2valid = false;
        double value1 = 0.0;
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
            try{
                value1 = Double.parseDouble(valueString);
                value1valid = true;
                System.out.println("What would you like to convert your " + value1 + " " + currencyType1 + " to? (dollars, euros, pounds)");
            } catch (NumberFormatException e) {
                value1valid = false;
                System.out.println("This is not a number. Please try again.");
            }
        }

        while(currency2valid == false){
            currencyType2 = input.nextLine();
        if(currencyType1.equals("dollars") && currencyType2.equals("dollars")){
            finalValue = value1;
            finalMessage = "You selected to convert from dollars to dollars. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
            currency2valid = true;
            System.out.println(finalMessage);
        } else if(currencyType1.equals("dollars") && currencyType2.equals("euros")){
             finalValue = 0.9 * value1;
             finalMessage = "You selected to convert from dollars to euros. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("dollars") && currencyType2.equals("pounds")){
             finalValue = 0.7 * value1;
             finalMessage = "You selected to convert from dollars to pounds. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("pounds")){
            finalValue = value1;
            finalMessage = "You selected to convert from pounds to pounds. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
            currency2valid = true;
            System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("dollars")){
             finalValue = 1.3 * value1;
             finalMessage = "You selected to convert from pounds to dollars. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("pounds") && currencyType2.equals("euros")){
             finalValue = 1.17 * value1;
             finalMessage = "You selected to convert from pounds to euros. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("euros")){
             finalValue = value1;
             finalMessage = "You selected to convert from euros to euros. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("dollars")){
             finalValue = 1.11 * value1;
             finalMessage = "You selected to convert from euros to dollars. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
             currency2valid = true;
             System.out.println(finalMessage);
        } else if(currencyType1.equals("euros") && currencyType2.equals("pounds")){
             finalValue = 0.86 * value1;
             finalMessage = "You selected to convert from euros to pounds. The conversion of " + value1 + " " + currencyType1 + " to " + currencyType2 + " is approximately: " + df.format(finalValue);
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