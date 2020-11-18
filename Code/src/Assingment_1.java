import java.util.Scanner;
public class Assingment_1 {

        public static void main (String [] args){

        System.out.println("What is Your Age");
        Scanner UserInput= new Scanner(System.in);

        int Age =UserInput.nextInt();

        if(Age>18 && Age<30){
            System.out.println("You will Recieve a Shopping Voucher");
        }
        else if(Age>30 && Age<40){
            System.out.println("You will Recieve a Car");
        }
        else if(Age>50){
            System.out.println("You will Recieve a House");
        }
        else {
            System.out.println("You do not qualify for a reward");
        }

    }


}
