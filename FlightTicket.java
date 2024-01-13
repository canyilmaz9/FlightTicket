import java.util.Scanner;

public class FlightTicket {

    public static void main (String []args){

        int km, age, tripType;

        double normalAmount, ageDiscount, ageDiscountRate = 0, discountedAmount,  roundTripDiscount ,total = 0;
       // boolean discountRate;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        km = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter trip type(1=> One Way, 2=> Round Trip): ");
        tripType = input.nextInt();

        if ((km>=1&& km <= 1000000) &&(age>0) &&(tripType ==1 || tripType==2) ){
            
        //ageDiscountRate = (age < 12) ? 0.50 : 0;
        //ageDiscountRate = (age >= 12 && age <=24) ? 0.10 : 1.0;
        //ageDiscountRate = (age > 65) ? 0.30 : 1.0;
        
        if (age<12){
            ageDiscountRate = 0.50;
        } else if(age <=24) {
            ageDiscountRate = 0.10;
        } else if(age >65) {
            ageDiscountRate = 0.30;
        }

            normalAmount = km * 0.10;

        //System.out.println(normalAmount);
        ageDiscount = normalAmount * ageDiscountRate;

        discountedAmount = normalAmount - ageDiscount;

           // System.out.println(discountedAmount);
            if (tripType==2) {

        roundTripDiscount = discountedAmount * 0.20;

        total = (discountedAmount-roundTripDiscount) *2;
            }
            else
                total = discountedAmount;

            System.out.println(" ");
            System.out.print("Total amount = " + total);

        }


        else {
            System.out.println("You Entered Incorrect Data!");
        }

    }
}
